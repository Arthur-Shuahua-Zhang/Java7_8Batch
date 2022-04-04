package com.antra.day4;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class JavaEight {
    public static void main(String[] args) {
//      Drawable d = () -> {
//          System.out.println("drawing a circle");
//      };
//      d.draw();
//
//      List<MyNode> list = new ArrayList<>();
////      Collections.sort(list, (n1, n2) -> n1.key -  n2.key);
//        Collections.sort(list, new MyComparator());

//        Supplier<Double> generateRandomNum = () -> Math.random();
//        System.out.println(generateRandomNum.get());

//        String str = "asdfasd";
//        if (str == null) {
//            System.out.println("nothing here");
//        } else {
//            System.out.println(str);
//        }
//
//        Optional<String> opt = Optional.ofNullable(str);
//        System.out.println(opt.orElse("nothing here"));

        List<Integer> list = new ArrayList<>(Arrays.asList(2, 1, 4, 5,1 , 5));

        System.out.println(list.stream().filter(e -> e > 2).collect(Collectors.toList()));

        Map<Integer, Integer> map = new HashMap<>();
        List<Map.Entry<Integer, Integer>> list2 = new ArrayList<>(map.entrySet());
        list2.stream().map(e -> e.getKey()).filter(e -> 2<3).collect(Collectors.toList());
        int[] array = {1, 24, 56};
        Arrays.stream(array); // list.stream();

        List<MyNode> list3 = new ArrayList<>();
//        list3.stream().;

//        List<int> why not correct?

    }
}


@FunctionalInterface // optional
interface SayBye {
    void sayBye();

    default void sayHello() {
        System.out.println("hello");
    }

    default void dayGM() {
        System.out.println("good morning");
    }

}











class MyNode {
    int key;
    int value;
}

class MyComparator implements Comparator<MyNode> {
    @Override
    public int compare(MyNode o1, MyNode o2) {
        return o1.key - o2.key;
    }
}

@FunctionalInterface
interface Drawable {
    public void draw();


}

//class MyDrawClass implements Drawable {
//    @Override
//    public void draw() {
//        System.out.println("drawing a circle");
//    }
//}
