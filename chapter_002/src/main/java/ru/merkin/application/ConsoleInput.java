package ru.merkin.application;

import java.util.Scanner;

/**
 * Class "ConsoleInput" is realizing manual input of answer of the question.
 */
public class ConsoleInput implements Input {
    /**
     * Variable "scanner" contains user input stream.
     */
    private Scanner scanner = new Scanner(System.in);

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
}