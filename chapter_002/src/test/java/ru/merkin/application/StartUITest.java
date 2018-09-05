package ru.merkin.application;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test foe StartUI class.
 *
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class StartUITest {

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
