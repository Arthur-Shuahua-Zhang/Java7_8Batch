package com.antra.day4;

import java.io.Serializable;

public class Student implements Serializable {

    private long seriesUID = 12312421412L;

    private String name;
    private int age;
    private transient int ssn;

    public Student(String name, int age, int ssn) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSsn() {
        return ssn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
}
