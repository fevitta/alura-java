package br.com.alurajava.banco.modelo;

public class Conta extends Object implements Comparable<Conta> {

    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saca(valor)) {
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public boolean jahEstaNaLista(Conta conta) {
        return this.equals(conta);
    }

    // Sobrescrevendo o método equals é possível criar uma validação específica para o criterio de conta x agencia
    // Dessa forma o contains em loop, que chama a equals, não vai retornar true para a mesma conta
    @Override
    public boolean equals(Object ref) {
        Conta outra = (Conta) ref;
        if (this.numero != outra.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Numero: " + this.numero + ", Saldo: " + this.saldo;
    }

    //Implmentando o método compareTo para ordenar as contas pela conta
    @Override
    public int compareTo(Conta outra) {
        return Double.compare(this.numero, outra.numero);
    }
}
