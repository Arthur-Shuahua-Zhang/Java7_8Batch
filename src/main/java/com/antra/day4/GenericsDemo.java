package com.antra.day4;

public class GenericsDemo {
    public static void main(String[] args) {
//        Node node1 = new Node(1, 1);
//        Node2 node2 = new Node2("abc", 3);
//        Node<Integer, Integer> node = new Node<>(1,1);
//        Node<String, Integer> node2 = new Node<>("abc", 3);
//        Node<Double, Double> node3 = new Node<>(1.0, 2.0);
        String[] arr = {"asdf", "asdf", "asdf"};
//        System.out.println(getFirstElements(arr));
        Double[] dArray = {1.0, 9.0, 8.0};
        method(arr, dArray);
    }

    public static <E> E getFirstElements(E[] array) {
        return array[0];
    }

    public static <E, U> void method(E[] arr, U[] arr2) {
        System.out.println(arr[0] + " " + arr2[0]);
    }
}

//class Node {
//    Integer key;
//    Integer value;
//
//    public Node(Integer key, Integer value) {
//        this.key = key;
//        this.value = value;
//    }
//}
//
//class Node2 {
//    String key;
//    Integer value;
//
//    public Node2(String key, Integer value) {
//        this.key = key;
//        this.value = value;
//    }
//}

class Node<K, V> {
    K key;
    V value;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }
}



