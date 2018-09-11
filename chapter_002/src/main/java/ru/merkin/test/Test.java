package ru.merkin.test;

public class Test {
    final static int SIZE = 10;
    final static String HELLO = "hello";
    int i;

    public Test() {

    }

    public Test(int i) {
        this.i = i;
    }

    static void printHello() {
        System.out.println(HELLO);
    }

//    public static void main(String[] args) {
//        Test.printHello();
//    }
}
