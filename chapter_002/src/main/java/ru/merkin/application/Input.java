package ru.merkin.application;

import java.util.List;

/**
 * Interface "Input" is needed to get answers to the questions.
 */
public interface Input {
    String ask(String question);

    default int ask(String question, List<Integer> range) throws MenuOutException {
        System.out.println("Error: method ask(String question, List<Integer> range) in Input interface is not overloaded");
        return -1;
    }
}
