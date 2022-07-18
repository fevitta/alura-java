package br.com.alurajava.io;

import java.io.*;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("temp.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        FileOutputStream fos = new FileOutputStream("temp_copia.txt");
        Writer wsr = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(wsr);

        String linha = br.readLine();

        while (linha != null) {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }

        bw.close();
        br.close();
    }
}
