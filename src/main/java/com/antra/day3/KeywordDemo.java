package com.antra.day3;

import java.util.*;

public class KeywordDemo {
    static int a = 10;
    static int b;

    static {
        b = 5;
        System.out.println("in the static block");
    }
    static class Entry {
        int a = 0;
    }


    public static void main(String[] args) {
//        final int num = 100;
////        num = 200; // compile error
//        final List<Integer> list = new ArrayList<>();
////        list = new ArrayList<>(); // compile erro
//         list.add(1);
//         list.add(2);
//
//         final double dou = 1.0;
//        System.out.println(dou);
        KeywordDemo.method2();
        method2();

//        Map<Integer, Integer> map = new HashMap<>();
//        for (Map.Entry<Integer, Integer>)

    }

    public static void method2() {}
}

class A {
    final void method() {
        System.out.println("in final method");
        KeywordDemo.method2();
//        method2();
    }
}

class B extends A {
//    @Override
//    void method() {
//
//    }
}

final class C {}
//class D extends C {}

final class MyImmutableClass {
    private final int id;
    private final String name;
    private final List<Integer> list;

    private final List<C> list2;

    public MyImmutableClass(int id, String name, List<Integer> list, List<C> list2) {
        this.id = id;
        this.name = name;
        this.list = list;
        this.list2 = list2;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getList() {
        List<Integer> res = new ArrayList<>();
        for (Integer num: list) {
            res.add(num);
        }
        return res;
//        return list;
    }

    public List<C> getList2() {
        List<C> res = new ArrayList<>(list2);
        return res;
    }
}


// top level class
class R {
    // static nested class
    static class U {
    }

    // inner class
    class P {
    }
    private void method(){}

}

class F {

    public void method() {

    }

    public void method(int a) {

    }

}




















