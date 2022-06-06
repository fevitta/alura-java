package br.com.alurajava.banco.modelo;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    protected double salario;
    private int tipo = 0; // 0 funcionario, 1 gerente

    /**
     * br.com.alurajava.banco.modelo.Funcionario#getBonificacao()
     * @return valor da bonificação do funcionario
     */
    public double getBonificacao() {
        return this.salario * 0.1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Funcionário: " + this.getNome() + ", " + this.getCpf();
    }
}
