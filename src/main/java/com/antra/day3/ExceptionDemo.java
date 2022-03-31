package com.antra.day3;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            dog();
        } catch (Exception e) {

        }
    }


    public static void dog() throws Exception{
        // throw all the object which is throwable (meaning implements Throwable interface)
        throw new Error();
    }
}
