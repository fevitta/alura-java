package br.com.alurajava.io;

import java.io.*;

public class TesteEscrita2 {
    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo
        //OutputStream fos = new FileOutputStream("lorem2.txt");
        //Writer osw = new OutputStreamWriter(fos);
        //Buff3eredWriter bw = new BufferedWriter(osw);

        FileWriter fw = new FileWriter("temp2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");

        //Usando o lineSeparator() ele converte a quebra de linha de acordo com o sistema operacional
        fw.write(System.lineSeparator());
        fw.write(System.lineSeparator());
        fw.write(System.lineSeparator());
        fw.write("asfasdfsafdas dfs sdf asf asdasd");

        fw.close();
    }
}
