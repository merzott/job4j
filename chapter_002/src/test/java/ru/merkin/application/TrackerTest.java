package ru.merkin.application;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for "Tracker" Class.
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class TrackerTest {

    /**
     * Test for "findByName" and "addItem" methods.
     * 1. adds 1 to 4 items to Tracker and find them by name
     * 2. checks that number of items in result is true,
     * 3. names of items in result are true
     * 4. ids of items in result are true
     */
    @Test
    public void findByNameComplex() {
        boolean result = true;

        for (int numOfItems = 1; numOfItems < 5; numOfItems++) {
            Tracker tracker = new Tracker();
            Item[] itemArr = new Item[numOfItems];
            String[] id = new String[numOfItems];
            Item[] itemFind;

            for (int i = 0; i < numOfItems; i++) {
                itemArr[i] = new Item("1");
            }
            for (int i = 0; i < numOfItems; i++) {
                id[i] = tracker.addItem(itemArr[i]).getId();
            }
            itemFind = tracker.findByName("1");
            result &= (itemFind.length == numOfItems);
            for (int i = 0; i < numOfItems; i++) {
                result &= itemFind[i].getName().equals("1");
                result &= (itemFind[i].getId().equals(id[i]));
            }
        }
        assertThat(result, is(true));
    }

    /**
     * Test for "findAll" method.
     * 1. adds 1 to 4 items to Tracker and find all items in Tracker
     * 2. checks that number of items in result is true,
     * 3. names of items in result are true
     * 4. ids of items in result are true
     */
    @Test
    public void findAllComplex() {
        boolean result = true;

        for (int numOfItems = 1; numOfItems < 5; numOfItems++) {
            Tracker tracker = new Tracker();
            Item[] itemArr = new Item[numOfItems];
            String[] id = new String[numOfItems];
            Item[] itemFind;

            for (int i = 0; i < numOfItems; i++) {
                itemArr[i] = new Item("1");
            }
            for (int i = 0; i < numOfItems; i++) {
                id[i] = tracker.addItem(itemArr[i]).getId();
            }
            itemFind = tracker.findAll();
            result &= (itemFind.length == numOfItems);
            for (int i = 0; i < numOfItems; i++) {
                result &= itemFind[i].getName().equals("1");
                result &= (itemFind[i].getId().equals(id[i]));
            }
        }
        assertThat(result, is(true));
    }

    /**
     * Test for "findByName" and "addItem" methods.
     * 1. adds 1 item to Tracker and replace it by another with different name
     * 2. checks that id of item in Tracker equal id of first item
     * 3. checks than name of item in Tracker equal name of second item
     * 4. checks that Tracker contains only one item with name of the second item
     */
    @Test
    public void replaceItemOneItemReplacedByAnother() {
        Tracker tracker = new Tracker();
        Item itemBase = new Item("1");
        Item itemReplace = new Item("2");
        String id;
        Item findReplaceById;
        Item[] findReplaceByName;
        boolean result;

        id = tracker.addItem(itemBase).getId();
        tracker.replace(id, itemReplace);
        findReplaceById = tracker.findById(id);
        findReplaceByName = tracker.findByName("2");
        result = (findReplaceById.getName().equals("2") && (findReplaceById.getId().equals(id)
                && findReplaceByName.length == 1));
        assertThat(result, is(true));
    }

    /**
     * Test for "delete" method.
     * 1. adds 1 to 4 items with same name to Tracker and delete one of them(test for each position)
     * 2. finds the remaining
     * 3. checks that number of items in result is true,
     * 4. check that ids of founded items in result are true
     */
    @Test
    public void deleteItemComplex() {
        boolean result = true;
        for (int numOfItems = 1; numOfItems < 5; numOfItems++) {
            for (int numToDelete = 0; numToDelete < numOfItems; numToDelete++) {
                Tracker tracker = new Tracker();
                Item[] item = new Item[numOfItems];
                String[] id = new String[numOfItems];
                Item[] findItem;
                for (int i = 0; i < numOfItems; i++) {
                    item[i] = new Item(String.valueOf(numOfItems));
                    id[i] = tracker.addItem(item[i]).getId();
                }
                tracker.delete(id[numToDelete]);
                findItem = tracker.findByName(String.valueOf(numOfItems));
                if (numOfItems == 1) {
                    result &= (findItem == null);
                } else {
                    result &= (findItem.length == numOfItems - 1);
                    for (int i = 0; i < findItem.length; i++) {
                        if (i < numToDelete) {
                            result &= findItem[i].getId().equals(id[i]);
                        } else {
                            result &= findItem[i].getId().equals(id[i + 1]);
                        }
                    }
                }
            }
        }
        assertThat(result, is(true));
    }
}
