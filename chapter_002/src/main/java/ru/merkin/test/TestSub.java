package ru.merkin.test;

import java.util.Date;

public class TestSub extends Test {
    int size = 4;
    private static int numOfObjects = 0;

    public TestSub() {
        TestSub.numOfObjects++;
        this.size = numOfObjects;
    }

    public TestSub(int size) {
        super(size);
        this.size = size;
        TestSub.numOfObjects++;
    }

    @Override
    public String toString() {
        return String.valueOf(this.size);
    }

    public static void main(String[] args) {
        TestSub.printHello();
        System.out.println(TestSub.SIZE);
        new TestSub();new TestSub();new TestSub();
        TestSub test = new TestSub(3001);
        System.out.println(new TestSub().toString() + new TestSub().toString());
        System.out.format("hello %6x %tr" + System.lineSeparator(), test.size, new Date());
        System.out.format("hello %x %<d %<,d" + System.lineSeparator(), test.size ,4);
        System.out.println(test.toString());
    }
}
