package ru.merkin.application;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for StartUI class.
 *
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class StartUITest {
    private PrintStream stdout = System.out;
    private ByteArrayOutputStream out = new ByteArrayOutputStream();

    private void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    private void backOutput() {
        System.setOut(this.stdout);
    }

    /**
     * Test for showAllItems method.
     */
    @Test
    public void showAllItemsThenOk() {
        Tracker tracker = new Tracker();
        Item item = tracker.addItem(new Item("name"));
        StringBuilder expect = new StringBuilder()
                .append(StartUI.Menu())
                .append(System.lineSeparator())
                .append(item.toString())
                .append(System.lineSeparator())
                .append(StartUI.Menu())
                .append(System.lineSeparator());
        loadOutput();
        Input input = new StubInput(new String[]{"2", "7"});
        new StartUI(input, tracker).init();
        backOutput();
        assertThat(new String(out.toByteArray()), is(expect.toString()));
    }

    /**
     * Test for findById method.
     */
    @Test
    public void findByIdThenOk() {
        Tracker tracker = new Tracker();
        Item item = tracker.addItem(new Item("name"));
        StringBuilder expect = new StringBuilder()
                .append(StartUI.Menu())
                .append(System.lineSeparator())
                .append(item.toString())
                .append(System.lineSeparator())
                .append(StartUI.Menu())
                .append(System.lineSeparator());
        loadOutput();
        Input input = new StubInput(new String[]{"5", item.getId(), "7"});
        new StartUI(input, tracker).init();
        backOutput();
        assertThat(new String(out.toByteArray()), is(expect.toString()));
    }

    /**
     * Test for findByName method.
     */
    @Test
    public void findByNameThenOk() {
        Tracker tracker = new Tracker();
        Item item = tracker.addItem(new Item("name"));
        StringBuilder expect = new StringBuilder()
                .append(StartUI.Menu())
                .append(System.lineSeparator())
                .append(item.toString())
                .append(System.lineSeparator())
                .append(StartUI.Menu())
                .append(System.lineSeparator());
        loadOutput();
        Input input = new StubInput(new String[]{"6", item.getName(), "7"});
        new StartUI(input, tracker).init();
        backOutput();
        assertThat(new String(out.toByteArray()), is(expect.toString()));
    }

    /**
     * Test for addAnItem method.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"1", "name", "7"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findByName("name")[0].getName(), is("name"));
    }

    /**
     * Test for editAnItem method.
     */
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.addItem(new Item("name"));
        Input input = new StubInput(new String[]{"3", item.getId(), "updated", "7"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findByName("updated")[0].getName(), is("updated"));
    }

    /**
     * Test for deleteAnItem method.
     */
    @Test
    public void whenDeleteItemThenTrackerHasNoItemWithSuchId() {
        Tracker tracker = new Tracker();
        Item item = tracker.addItem(new Item("name"));
        Input input = new StubInput(new String[]{"4", item.getId(), "7"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()) == null, is(true));
    }
}
