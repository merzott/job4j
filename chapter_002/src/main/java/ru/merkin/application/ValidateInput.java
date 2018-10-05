package ru.merkin.application;

import java.util.List;

public class ValidateInput implements Input {

    private final Input input;

    public ValidateInput(Input input) {
        this.input = input;
    }
    @Override
    public String ask(String question) {
        return this.input.ask(question);
    }
    @Override
    public int ask(String question, List<Integer> range) {
        int key = -1;
        boolean invalid = true;
        do {
            try {
                key = this.input.ask(question, range);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Error: input type is not numeric");
            } catch (MenuOutException moe) {
                System.out.println("Error: input value is not in available range");
            }
        } while (invalid);
        return key;
    }
}
