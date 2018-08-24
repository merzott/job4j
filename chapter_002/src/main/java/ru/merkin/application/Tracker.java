package ru.merkin.application;

import java.lang.reflect.Array;
import java.util.Random;

/**
 * Class "Tracker" is array of items with API
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    private Item[] item = new Item[100];
    private static final Random random = new Random();
    private int position;

    /**
     * Method "generateId" generates unique Id for Item
     * @return unique Id ot type String
     */
    private String generateId() {
        return String.valueOf(random.nextInt() + System.currentTimeMillis());
    }

    /**
     * Method "addItem" is register new item to system
     * @param item new item which have name
     * @return
     */
    public Item addItem(Item item) {
        item.setId(generateId());
        this.item[position++] = item;
        return item;
    }

    /**
     * Method "replace" is edits item by id
     * @param id unique id of item to edit
     * @param item item to replace
     */
    public void replace(String id, Item item) {
        for (int i = 0; i < this.item.length; i++) {
            if (id.equals(this.item[i].getId())) {
                this.item[i] = item;
                break;
            }
        }
    }

    /**
     * Method "delete" is deletes item by id
     * @param idunique id of item to delete
     */
    public void delete(String id) {
        int positionToDelete;
        boolean noSuchId = true;

        for (positionToDelete = 0; positionToDelete < position; positionToDelete++) {
            if (id.equals(this.item[positionToDelete].getId())) {
                noSuchId = false;
                break;
            }
        }
        if (noSuchId) {
            System.out.println("DELETE ITEM: There are no item with id =\"" + id + "\"");
        } else {
            if (positionToDelete == position - 1) {
                this.item[positionToDelete] = null;
                --position;
            } else {
                System.arraycopy(this.item, positionToDelete, this.item,
                                positionToDelete + 1, position - positionToDelete - 1);
                --position;
            }
        }
    }

    /**
     * Method "findAll" finds all actual items
     * @return array of all items
     */
    public Item[] findAll() {
        Item[] item = new Item[position];
        for (int i = 0; i < position; i++) {
            item[i] = this.item[i];
        }
        return item;
    }

    /**
     * Method "findByName" finds all items by name
     * @param key name of item
     * @return array of item wich have names equal key param
     */
    public Item[] findByName(String key) {
        Item[] findResult;
        int[] findIndex = new int[position];
        int totalMatch = 0;

        for (int index = 0; index < position; index++) {
            if (key.equals(this.item[index].getName())) {
                findIndex[totalMatch++] = index;
            }
        }
        if (totalMatch == 0) {
            System.out.println("FIND_ITEM(findByName): There are no item with name contains = \"" + key + "\"" );
            findResult = null;
        } else {
            findResult = new Item[totalMatch];
            for (int index = 0; index < totalMatch; index++) {
                findResult[index] = this.item[findIndex[index]];
            }
        }
        return findResult;
    }

    /**
     * Method "findById" finds item by Id
     * @param id id of item
     * @return item wich id equals id param
     */
    public Item findById(String id) {
        Item findResult = new Item();
        boolean noSuchId = true;
        for (int index = 0; index < position; index++) {
            if (id.equals(this.item[index].getId())) {
                findResult = this.item[index];
                noSuchId = false;
                break;
            }
        }
        if(noSuchId) {
            System.out.println("FIND_ITEM(findById): There are no item with id =\"" + id + "\"");
        }
        return findResult;
    }



}
