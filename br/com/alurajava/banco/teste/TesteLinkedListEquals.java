package br.com.alurajava.banco.teste;

import br.com.alurajava.banco.modelo.Conta;

import java.util.ArrayList;
import java.util.LinkedList;

public class TesteLinkedListEquals {
    public static void main(String[] args) {

        //Generics
        LinkedList<Conta> lista = new LinkedList<Conta>();

        Conta cc = new Conta(22, "11");
        lista.add(cc);

        Conta cc2 = new Conta(22, "22");
        lista.add(cc2);

        Conta cc3 = new Conta(22, "22");
        boolean existe = lista.contains(cc3);

        System.out.println("Já existe? " + existe);

        for(Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
