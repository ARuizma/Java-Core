package org.example;

public class Demo {
    static Demo obj;
    static {
        System.out.println(obj);
        Demo.obj = new Demo();
    }

    public static void main(String[] args) {

    }
}
