package ru.merkin.application;

//import jdk.internal.util.xml.impl.Input;

import java.util.ArrayList;
import java.util.List;

/**
 * Class StartUI realises user interface to Tracker.
 *
 * @author Roman Merkin
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    private Tracker tracker;
    private Input input;
    /**
     * Menu working flag
     */
    private boolean isWorking = true;
    private static final String ADD_ITEM = "1";
    private static final String SHOW_ALL_ITEMS = "2";
    private static final String EDIT_ITEM = "3";
    private static final String DELETE_ITEM = "4";
    private static final String FIND_ITEM_BY_ID = "5";
    private static final String FIND_ITEM_BY_NAME = "6";
    private static final String EXIT_PROGRAM = "7";
    private final String menu = new StringBuilder(System.lineSeparator())
            .append("Menu:").append(System.lineSeparator())
            .append("1. Add new Item").append(System.lineSeparator())
            .append("2. Show all items").append(System.lineSeparator())
            .append("3. Edit item").append(System.lineSeparator())
            .append("4. Delete Item").append(System.lineSeparator())
            .append("5. Find Item by id").append(System.lineSeparator())
            .append("6. Find Items by name").append(System.lineSeparator())
            .append("7. Exit program").append(System.lineSeparator())
            .toString();

    /**
     * Constructor of StartUI.
     *
     * @param input   set user communication interface
     * @param tracker set Tracker
     */
    public StartUI(Input input, Tracker tracker) {
        this.tracker = tracker;
        this.input = input;
    }

    /**
     *  Method "setIsWorking" gets isWorking value
     * @return isWorking value
     */
    public void setIsWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }

    /**
     * Method showMenu is show main menu.
     */
    public void showMenu() {
        System.out.println(menu);
    }

    /**
     * Method getChoice is asking to choose menu item
     *
     * @return user input word
     */
    public String getChoice() {
        return this.input.ask("enter the menu item: ");
    }

    /**
     * Method init is showing main menu and is realising it's work.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions(this);
        List<Integer> range = menu.getActionsRange();
        do {
            menu.show();
            menu.select(range.indexOf(Integer.parseInt(input.ask("select: "))));
        } while (isWorking);
    }

    /**
     * Method addAnItem is realising user interface to add an item to tracker
     */
    private void addAnItem() {
        this.tracker.addItem(new Item(this.input.ask("enter new Item name: ")));
    }

    /**
     * Method showAllItems is realising user interface to show all items
     */
    private void showAllItems() {
        Item[] find = this.tracker.findAll();
        if (find.length > 0) {
            for (Item item : find) {
                System.out.println(item.toString());
            }
        } else {
            System.out.println("FIND ALL: There are no items to find. Tracker is empty");
        }
    }

    /**
     * Method editAnItem is realising user interface to edit an item
     */
    private void editAnItem() {
        String id = this.input.ask("Enter id of Item to edit: ");
        Item edit = this.tracker.findById(id);
        if (edit != null) {
            edit.setName(this.input.ask("Enter new Item name: "));
            if (this.tracker.replace(id, edit)) {
                System.out.println("EDIT: Success. " + edit.toString());
            } else {
                System.out.println("EDIT: Fail. Unknown fail.");
            }
        } else {
            System.out.println("EDIT: Fail. There are no Item with id - " + id);
        }
    }

    /**
     * Method editAnItem is realising user interface to delete an item
     */
    private void deleteAnItem() {
        String id = this.input.ask("Enter id of Item to delete: ");
        if (this.tracker.findById(id) != null) {
            if (this.tracker.delete(id)) {
                System.out.println("DELETE: Success");
            } else {
                System.out.println("DELETE: Fail. Unknown fail.");
            }
        } else {
            System.out.println("DELETE: Fail. There are no Item with id - " + id);
        }
    }

    /**
     * Method findAnItemById is realising user interface to find an item by id
     */
    private void findAnItemById() {
        String id = this.input.ask("Enter id of Item to find: ");
        Item item = this.tracker.findById(id);
        if (item != null) {
            System.out.println(item.toString());
        } else {
            System.out.println("FIND BY ID: item not found. id - " + id + "Doesn't exist");
        }
    }

    /**
     * Method findAnItemByName is realising user interface to find items by name
     */
    private void findAnItemByName() {
        String name = this.input.ask("Enter name of items to find: ");
        Item[] find = this.tracker.findByName(name);
        if (find.length > 0) {
            for (Item item : find) {
                System.out.println(item.toString());
            }
        } else {
            System.out.println("FIND BY NAME: item not found. Item with name \"" + name + "\" isn't exist");
        }
    }

    /**
     * Method wrongChoice is inform user that he type an nonexistent variant
     */
    private void wrongChoice() {
        System.out.println("Wrong choice. Please use numbers from 1 to 7");
    }

    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }

}
