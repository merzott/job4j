package ru.job4j.conditon;

/**
 * class "DummyBot" implements simple bot.
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class DummyBot {
    /**
     * Method "answer" implements answering to questions.
     * @param question question which you ask the bot.
     * @return answer to the question.
     */
    public String answer(String question) {
        String result = "I don't now how to answer this question. Please ask another.";

        if (question.equals("Hi, Bot.")) {
            result = "Hi, smart ass.";
        } else if (question.equals("Bye.")) {
            result = "See you later.";
        }
        return result;
    }

}
