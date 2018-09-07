package ru.merkin.test;

public class TestAbstrSub extends TestAbstr {

    public void gogo() {
        System.out.println("2e");
    }

    public static void main(String[] args) {
        new TestAbstrSub().gogo();
    }
}
