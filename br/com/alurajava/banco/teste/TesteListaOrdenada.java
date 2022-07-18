package br.com.alurajava.banco.teste;

import br.com.alurajava.banco.modelo.Conta;
import br.com.alurajava.banco.modelo.Gerente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteListaOrdenada {

    public static void main(String[] args) {

        Conta cc1 = new Conta(15, "33");
        cc1.deposita(333.0);

        Conta cc2 = new Conta(10, "44");
        cc2.deposita(444.0);

        Conta cc3 = new Conta(5, "11");
        cc3.deposita(111.0);

        Conta cc4 = new Conta(1, "22");
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc2);
        lista.add(cc4);
        lista.add(cc1);
        lista.add(cc3);


        for (Conta conta : lista) {
            System.out.println(conta);
        }

        //NumeroDaContaComparator comparator = new NumeroDaContaComparator();

        System.out.println("---------");

        //Podemos usar varias opcoes para ordernar um array.
        // Criar um comparator e usar lista.sort(comp).
        // Chamar a Collections.sort() ou então definir o metodo compareTo() na classe e usar o lista.sort(null)
        //lista.sort(comparator);
        //Collections.sort(lista);
        //lista.sort(null);

        // Mais uma opcao usando lambdas
        lista.sort((c1, c2) -> Integer.compare((int)c1.getSaldo(), (int)c2.getSaldo()) );

        lista.forEach(System.out::println);

        for (Conta conta : lista) {
            System.out.println(conta);
        }

    }

}

class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {

        if (c1.getNumero() < c2.getNumero()) {
            return -1;
        }

        if (c1.getNumero() > c2.getNumero()) {
            return 1;
        }

        return 0;
    }
}
