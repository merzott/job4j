package ru.merkin.test;

public class Test {
    final static int SIZE = 10;
    final static String hello = "hello";
    int i;

    public Test() {

    }
    public Test(int i) {
        this.i = i;
    }
    final static void printHello() {
        System.out.println(hello);
    }

//    public static void main(String[] args) {
//        Test.printHello();
//    }
}
