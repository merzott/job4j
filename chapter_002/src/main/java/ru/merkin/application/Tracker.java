package ru.merkin.application;

import java.lang.reflect.Array;
import java.util.Arrays;
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
        return String.valueOf(this.random.nextInt() + System.currentTimeMillis());
    }

    /**
     * Method "addItem" is register new item to system
     * @param item new item
     * @return item with generated id
     */
    public Item addItem(Item item) {
        item.setId(generateId());
        this.item[this.position++] = item;
        return item;
    }

    /**
     * Method "replace" is edits item by id (id not changing)
     * @param id unique id of item to edit
     * @param item item to replace
     */
    public void replace(String id, Item item) {
        for (int i = 0; i < this.item.length; i++) {
            if (id.equals(this.item[i].getId())) {
                item.setId(this.item[i].getId());
                this.item[i] = item;
                break;
            }
        }
    }

    /**
     * Method "delete" is deletes item by id
     * @param id unique id of item to delete
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < this.position; i++) {
            if (id.equals(this.item[i].getId())) {
                System.arraycopy(this.item, i + 1, this.item, i, this.position - i - 1);
                --this.position;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Method "findAll" finds all actual items
     * @return array of all items
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.item, this.position);
    }

    /**
     * Method "findByName" finds all items by name
     * @param key name of item
     * @return array of item wich have names equal key param
     */
    public Item[] findByName(String key) {
        Item[] findResult = new Item[100];
        int totalMatch = 0;

        for (int index = 0; index < this.position; index++) {
            if (key.equals(this.item[index].getName())) {
                findResult[totalMatch++] = this.item[index];
            }
        }
        return Arrays.copyOf(findResult, totalMatch);
    }

    /**
     * Method "findById" finds item by Id
     * @param id id of item
     * @return item wich id equals id param
     */
    public Item findById(String id) {
        Item findResult = new Item();
        for (int index = 0; index < this.position; index++) {
            if (id.equals(this.item[index].getId())) {
                findResult = this.item[index];
                break;
            }
        }
        return findResult;
    }

}
