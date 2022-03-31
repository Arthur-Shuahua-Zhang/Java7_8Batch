package com.antra;

public class MyFirstClass {
    public static void main(String[] args) {
//        // this is print out
//        System.out.println("Hello new batch!");
//
//        int a = 1;
//        Integer b = new Integer(4);
//        System.out.println(a + b);
//        String s = "1_";
//        StringBuilder  sb1 = new StringBuilder("2_");
//        StringBuffer sb2 = new StringBuffer("3_");
//
//        cancat1(s);
//        cancat2(sb1);
//        cancat3(sb2);
//
//        System.out.println(s);
//        System.out.println(sb1.toString());
//        System.out.println(sb2.toString());
//
//        String s1 = "Hello1111Hello1111Hello1111Hello1111Hello1111Hello1111Hello1111Hello1111Hello1111Hello1111Hello1111Hello1111Hello1111Hello1111Hello1111";
//        String s2 = "Hello1111Hello1111Hello1111Hello1111Hello1111Hello1111Hello1111Hello1111Hello1111Hello1111Hello1111Hello1111Hello1111Hello1111Hello1111";
//        System.out.println(s1 == s2);


//
//        String s3 = new String("abc");

//        s3.equals() -> Object .equals() -> ==


//        System.out.println(s1 == s3);
//
//        String s4 = new String("abc");
//        System.out.println(s3 == s4);

//        Integer a = 10;
//        Integer b = 10;
//        Integer c = new Integer(10);
//        System.out.println(a == b);
//        System.out.println(a == c);

//        Integer d = 128;
//        Integer e = 128;
//        System.out.println(d == e);

        Node n1 = new Node(1);
        Node n2 = new Node(1);
        String s1 = new String("sdf");
        System.out.println(n1.equals(n2));

    }

//
//    public static void cancat1(String s) {
//        s = s + "abc";
//    }
//
//    public static void cancat2(StringBuilder s) {
//        s = s.append("abc");
//    }
//
//    public static void cancat3(StringBuffer s) {
//        s = s.append("abc");
//    }

}

class Node{

    int value;

    public Node(int value) {
        this.value = value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node other = (Node)o;
        return this.value == other.value;
    }

    @Override
    public int hashCode() {
        return value;
    }
}
