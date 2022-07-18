package br.com.alurajava.banco.teste;

import br.com.alurajava.banco.modelo.Conta;
import br.com.alurajava.banco.modelo.Gerente;

import java.util.ArrayList;

public class testeArray {
    public static void main(String[] args) {

        //Array []
        int[] array = new int[5];

        System.out.println("array: " + array);
        System.out.println("array[0]: " + array[0]);

        Gerente[] gerentes = new Gerente[1];

        Gerente gerente0 = new Gerente();
        gerente0.setNome("Felipe");
        gerente0.setCpf("123.456.789-10");
        gerente0.setSalario(1000);

        Gerente gerente1 = new Gerente();
        gerente1.setNome("Paulo");
        gerente1.setCpf("123.456.789-11");
        gerente1.setSalario(10000);

        gerentes[0] = gerente0;

        System.out.println("Gerente0: " + gerentes[0]);
        System.out.println("Gerente0.Bonificao: " + gerentes[0].getBonificacao());

        int[] refs = {1,2,3,4,5};
        System.out.println("refs.length: " + refs.length);

        //ArrayList é uma implementação de Array
        ArrayList lista = new ArrayList();

        lista.add(gerente0);
        System.out.println("lista.size(): " + lista.size());
        System.out.println("lista.get(0): " + lista.get(0));

        lista.add(gerente1);
        System.out.println("lista.size(): " + lista.size());
        System.out.println("lista.get(1): " + lista.get(1));

        //Loop lista com for
        System.out.println("Loop lista");
        for (Object obj : lista) {
            System.out.println(obj);
        }

        lista.remove(0);
        System.out.println("lista.size(): " + lista.size());

        //Generics
        //Ao criar um ArrayList podemos informar o tipo de referencia que será aceita, usando o <>
        ArrayList<Gerente> listaGerentes = new ArrayList<>();

        listaGerentes.add(gerente0);
        listaGerentes.add(gerente1);

        if (listaGerentes.contains(gerente0)) {
            System.out.println("ListaGerentes contem o gerente0");
        }

        listaGerentes.remove(gerente0);

        if (listaGerentes.contains(gerente0)) {
            System.out.println("ListaGerentes contem o gerente0");
        }
    }
}
