package ru.job4j.condition;

import ru.job4j.conditon.DummyBot;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *  Test "DummyBot" class.
 * @author Roman Merkin
 * */
public class DummyBotTest {
    /**
     * Test "answer" method. Unknown question.
     * if question = "hohoho", answer is "I don't now how to answer this question. Please ask another."
     */
    @Test
    public void dummyBotUnknownQuestion() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("hohoho."), is("I don't now how to answer this question. Please ask another."));
    }

    /**
     * Test "answer" method. Known question.
     * if question = "Hi, Bot", answer is "I don't now how to answer this question. Please ask another."
     */
    @Test
    public void dummyBotKnownQuestionHi() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Hi, Bot."), is("Hi, smart ass."));
    }

    /**
     * Test "answer" method. Known question.
     * if question = "Bye.", answer is "See you later."
     */
    @Test
    public void dummyBotKnownQuestionBye() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Bye."), is("See you later."));
    }
}
