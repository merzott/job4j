package ru.merkin.application;

import java.util.List;

/**
 * Interface "Input" is needed to get answers to the questions.
 */
public interface Input {
    String ask(String question);

    int ask(String question, List<Integer> range) throws MenuOutException;
}
