package br.com.alurajava.banco.modelo;

import br.com.alurajava.banco.modelo.Funcionario;

public class Gerente extends Funcionario {
	private int senha;
	
	public boolean autenticaSenha(int senha) {
		return this.senha == senha;
	}
	
	public double getBonificacao() {
		return super.salario;
	}

	@Override
	public String toString() {
		return "Funcionário: " + super.getNome() + ", " + super.getCpf();
	}
}
