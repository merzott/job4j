package ru.merkin.application;

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
}
