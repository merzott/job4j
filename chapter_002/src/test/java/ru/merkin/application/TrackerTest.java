package ru.merkin.application;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void addItemOneItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("1");
        System.out.println(tracker.addItem(item).getId());
        assertThat(item.getName().equals("1"), is(true));
    }

    @Test
    public void addItemTwoItems() {
        boolean result;
        Tracker tracker = new Tracker();
        Item item1 = new Item();
        item1.setName("1");
        Item item2 = new Item();
        item2.setName("2");

        System.out.println(tracker.addItem(item1).getId());
        System.out.println(tracker.addItem(item2).getId());

        result = item1.getName().equals("1") && item2.getName().equals("2");

        assertThat(result, is(true));
    }

}
