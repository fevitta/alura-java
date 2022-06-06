//use o comando package é usado para organizar o código e resolver conflitos com classes de mesmo nome
package br.com.alurajava.banco.teste;

//Use o comando import para importar e usar diretamente a classe/procedimento sem ter que informar o caminho completo

import br.com.alurajava.banco.modelo.Funcionario;
import br.com.alurajava.banco.modelo.Gerente;

import java.lang.String;

//Tambem é possivel usar o * para importar todos os objetos
//import br.com.alurajava.banco.modelo.*;

public class testeFuncionario {

	public static void main(String[] args) {
        Funcionario f1 = new Gerente();
        f1.setSalario(3000.0);
        System.out.println(f1.getTipo());
        System.out.println(f1.getBonificacao());

        Funcionario f2 = new Gerente();
        f2.setTipo(1);
        f2.setSalario(5000.0);
        System.out.println(f2.getTipo());
        System.out.println(f2.getBonificacao());
    }

}

