package br.com.alurajava.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteConsole {
    public static void main(String[] args) throws IOException {
        System.out.println("Digite 1 para informar um texto ou 2 para ler o arquivo temp.txt");
        InputStreamReader isrConsole = new InputStreamReader(System.in);
        BufferedReader brConsole = new BufferedReader(isrConsole);

        String opcao = brConsole.readLine();
        if (opcao.equals("1")) {
            System.out.println("Digite o texto");
            String texto = System.console().readLine();
            System.out.println(texto);
        } else {
            try {
                FileInputStream fis = new FileInputStream("temp.txt");
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr);

                String linha = br.readLine();

                while (linha != null && !linha.isEmpty()) {
                    System.out.println(linha);
                    linha = br.readLine();
                }

                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
