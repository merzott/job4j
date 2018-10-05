package ru.merkin.application;

import java.util.List;
import java.util.Scanner;

/**
 * Class "ConsoleInput" is realizing manual input of answer of the question.
 */
public class ConsoleInput implements Input {
    /**
     * Variable "scanner" contains user input stream.
     */
    protected Scanner scanner = new Scanner(System.in);

    /**
     * Method "ask" give the next answer to the question.
     *
     * @param question some question
     * @return answer
     */
    @Override
    public String ask(String question) {
        System.out.print(question);
        return scanner.next();
    }

    @Override
    public int ask(String question, List<Integer> range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Out of menu range.");
        }
    }
}