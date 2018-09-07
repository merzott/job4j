package ru.merkin.application;

public class StubInput implements Input {
    private String[] answers;
    private int position;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String ask(String question) {
        return this.answers[this.position++];
    }
}
