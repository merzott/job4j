package ru.merkin.application;

import java.util.List;

public class ValidateInput extends ConsoleInput {

    @Override
    public int ask(String question, List<Integer> range) {
        int key = -1;
        boolean invalid = true;
        do {
            try {
                key = Integer.valueOf(super.ask(question));
                for (int keys : range) {
                    if (keys == key) {
                        invalid = false;
                        break;
                    }
                }
                if (invalid) {
                    throw new MenuOutException("Input value out of range");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Error: input type is not numeric");
            } catch (MenuOutException moe) {
                System.out.println("Error: input value is not in available range");
            }
        } while (invalid);
        return key;
    }
}
