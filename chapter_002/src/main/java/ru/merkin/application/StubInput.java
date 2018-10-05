package ru.merkin.application;

import java.util.List;

/**
 * Class "StubInput" is needed for tests and is realizing automatic input for several questions.
 */
public class StubInput implements Input {
    private String[] answers;
    private int position;

    /**
     * Constructor of "StubInput" class.
     * @param answers Array of String contains several input answers.
     */
    public StubInput(String[] answers) {
        this.answers = answers;
    }

    /**
     * Method "ask" give the next answer to the question.
     * @param question some question
     * @return next answer
     */
    @Override
    public String ask(String question) {
        return this.answers[this.position++];
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
