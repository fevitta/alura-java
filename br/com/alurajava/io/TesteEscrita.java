package br.com.alurajava.io;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo
        OutputStream fos = new FileOutputStream("temp.txt");
        Writer wsr = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(wsr);

        // Escrevendo no arquivo com quebra de linha
        bw.write("Escrevendo no arquivo com quebra de linha \n");
        bw.write("Linha 2");

        bw.close();
    }
}
