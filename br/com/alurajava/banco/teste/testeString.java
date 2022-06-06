package br.com.alurajava.banco.teste;

import br.com.alurajava.banco.modelo.Gerente;

public class testeString {
    public static void main(String[] args) {
        // Todas as Strings em Java são imutaveis
        String nome = "Alura";
        System.out.println(nome);

        nome.replace("Alura", "Alura Java");
        System.out.println(nome);

        String nome2 = nome.replace("Alura", "Alura Java");
        System.out.println(nome2);

        String nome3 = nome2.substring(6);
        System.out.println(nome3);

        System.out.println(nome2.substring(2, 5));

        System.out.println(nome2.charAt(2));

        //StringBuilder é mutável, diferente da String que é imutável
        StringBuilder builder = new StringBuilder("Socorram");
        builder.append("-");
        builder.append("me");
        builder.append(", ");
        builder.append("subi ");
        builder.append("no ");
        builder.append("ônibus ");
        builder.append("em ");
        builder.append("Marrocos");
        String texto = builder.toString();
        System.out.println(texto);

        Gerente funcionario1 = new Gerente();
        funcionario1.setNome("Felipe");
        funcionario1.setCpf("123.456.789-10");

        // Como implementamos o metodo toString (com override), podemos usar o metodo toString para imprimir o objeto de uma forma "customizada"
        System.out.println(funcionario1);
    }
}