package ru.merkin.application;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class StartUI {
    private Tracker tracker;
    private ConsoleInput consoleInput;
    private static final String ADD_ITEM           = "1";
    private static final String SHOW_ALL_ITEMS     = "2";
    private static final String EDIT_ITEM          = "3";
    private static final String DELETE_ITEM        = "4";
    private static final String FIND_ITEM_BY_ID    = "5";
    private static final String FIND_ITEM_BY_NAME  = "6";
    private static final String EXIT_PROGRAM       = "7";

    public StartUI(ConsoleInput consoleInput, Tracker tracker) {
        this.tracker = tracker;
        this.consoleInput = consoleInput;
    }

    public static void showMenu() {
        System.out.println( System.lineSeparator()
                + "Menu:"                   + System.lineSeparator()
                + "1. Add new Item"         + System.lineSeparator()
                + "2. Show all items"       + System.lineSeparator()
                + "3. Edit item"            + System.lineSeparator()
                + "4. Delete Item"          + System.lineSeparator()
                + "5. Find Item by id"      + System.lineSeparator()
                + "6. Find Items by name"   + System.lineSeparator()
                + "7. Exit program"         + System.lineSeparator()
        );
    }
    public String getChoice() {
        return this.consoleInput.ask("enter the menu item: ");
    }
    public void init() {
        String choice = "not initialized";
        while (!EXIT_PROGRAM.equals(choice)) {
            showMenu();
            choice = getChoice();
            switch (choice) {
                case ADD_ITEM           : this.addAnItem();         break;
                case SHOW_ALL_ITEMS     : this.showAllItems();      break;
                case EDIT_ITEM          : this.editAnItem();        break;
                case DELETE_ITEM        : this.deleteAnItem();      break;
                case FIND_ITEM_BY_ID    : this.findAnItemById();    break;
                case FIND_ITEM_BY_NAME  : this.findAnItemByName();  break;
                case EXIT_PROGRAM       :                           break;
                default                 : this.wrongItem();         break;

            }

        }
    }
    private void addAnItem() {
        this.tracker.addItem(new Item(this.consoleInput.ask("enter new Item name: ")));
    }
    private void showAllItems() {
        for(Item item: this.tracker.findAll()) {
            System.out.println(item.toString());
        }
    }
    private void editAnItem() {
        this.tracker.replace(this.consoleInput.ask("Enter id of Item to edit: "),
                                new Item(this.consoleInput.ask("Enter new Item name: ")));
    }
    private void deleteAnItem() {
        this.tracker.delete(this.consoleInput.ask("Enter id of Item to delete: "));
    }
    private void findAnItemById() {
        Item item = this.tracker.findById(this.consoleInput.ask("Enter id of Item to find: "));
        System.out.println(item.toString());
    }
    private void findAnItemByName() {
        for(Item item: this.tracker.findByName(this.consoleInput.ask("Enter name of items to find: "))) {
            System.out.println(item.toString());
        }
    }
    private void wrongItem() {
        System.out.println("Wrong choice. Please use numbers from 1 to 7");
    }
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }

}
