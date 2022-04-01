package com.antra.day4;

import java.io.*;

public class StuSer {
    public static void main(String[] args) {
        Student stu = new Student("Charlie", 60, 123456);
        try {
            OutputStream fileout = new FileOutputStream("/Users/shaohua/Desktop/JavaMaterial/student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(stu);
            out.close();
            fileout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
