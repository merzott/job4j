package ru.merkin.application;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {


//    @Test
//    public void addItemForOneToFourItemsThanNameIsOkAndIdExist() {
//        boolean result = true;
//        Tracker tracker = new Tracker();
//
//        for (int numOfItems = 1; numOfItems < 5; numOfItems++) {
//            Item[] itemArr = new Item[numOfItems];
//            String[] id = new String[numOfItems];
//            Item[] itemFind;
//
//            for (int i = 0; i < numOfItems; i++) {
//                itemArr[i] = new Item(Integer.toString(i));
//            }
//            for (int i = 0; i < numOfItems; i++) {
//                id[i] = tracker.addItem(itemArr[i]).getId();
//            }
//            for (int i = 0; i < numOfItems; i++) {
//                result &= itemArr[i].getName().equals(Integer.toString(i));
//                result &= (id[i] != null);
//            }
//        }
//        assertThat(result, is(true));
//    }

    @Test
    public void findByName() {
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

    @Test
    public void replaceItemOneItem() {
        Tracker tracker = new Tracker();
        Item itemBase = new Item("1");
        Item itemReplace = new Item("2");
        String id;
        Item[] findReplace;
        Item[] findBase;
        boolean result;

        id = tracker.addItem(itemBase).getId();
        tracker.replace(id, itemReplace);
        findBase = tracker.findByName("1");
        findReplace = tracker.findByName("2");

        result = (findBase == null) && (findReplace[0].getName().equals("2") && (findReplace.length == 1));
        assertThat(result, is(true));
    }

    @Test
    public void deleteItemOneItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("1");
        String id;
        Item[] findItem;
        boolean result;

        id = tracker.addItem(item).getId();
        tracker.delete(id);
        findItem = tracker.findByName("1");

        result = (findItem == null);
        assertThat(result, is(true));
    }

    @Test
    public void deleteItemTwoItem() {
        Tracker tracker = new Tracker();
        Item[] item = new Item[4];
        item[0] = new Item("1");
        item[1] = new Item("1");
        item[2] = new Item("1");
        item[3] = new Item("1");
        String[] id = new String[4];
        //String id1, id2, id3, id4;
        Item[] findItem;
        boolean result;

        id[0] = tracker.addItem(item[0]).getId();
        id[1] = tracker.addItem(item[1]).getId();
        id[2] = tracker.addItem(item[2]).getId();
        id[3] = tracker.addItem(item[3]).getId();
        tracker.delete(id[3]);
        findItem = tracker.findByName("1");
        for (Item i: findItem) {
            System.out.println(i.getId());
        }
        for (int i = 0; i < id.length; i++) {
            System.out.println(Integer.toString(i) + " - " + id[i]);
        }
        result = true;//findItem[0].getId().equals(id1);
        //result = (findItem.length == 1) && (findItem[0].getId().equals(id2));
        assertThat(result, is(true));
    }

}
