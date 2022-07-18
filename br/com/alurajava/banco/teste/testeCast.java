package br.com.alurajava.banco.teste;

public class testeCast {
    public static void main(String[] args) {

        int numero = 3;
        double valor = (double) numero; //cast explícito

        double valorComDecimal = 3.56;
        int valorInt = (int) valorComDecimal;

        System.out.println("Numero: " + numero);
        System.out.println("valor: " + valor);
        System.out.println("valorInt: " + valorInt);
    }
}
