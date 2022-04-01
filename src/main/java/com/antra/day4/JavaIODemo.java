package com.antra.day4;

import java.io.*;

public class JavaIODemo {

    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;

        try {
            in = new FileReader("/Users/shaohua/Desktop/JavaMaterial/input.txt");
            out = new FileWriter("/Users/shaohua/Desktop/JavaMaterial/output.txt");
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }


    }
}
