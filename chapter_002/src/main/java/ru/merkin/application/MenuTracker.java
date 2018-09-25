package ru.merkin.application;

import java.util.ArrayList;
import java.util.List;

/**
 * Class "MenuTracker" is realize menu of user interface to work with Tracker
 */
public class MenuTracker {
    /**
     * Input interface
     */
    private Input input;

    /**
     * Tracker to work with
     */
    private Tracker tracker;

    /**
     * Actions accessible in menu
     */
    private List<UserAction> actions = new ArrayList<>();

    /**
     * Constructor "MenuTracker"
     * @param input input type
     * @param tracker tracker to work
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     *  Method "getActionLength"
     * @return number of actions in menu list
     */
    public int getActionLength() {
        return this.actions.size();
    }

    /**
     *  Method "getActionKey" is needed to get key of action
     * @param numOrder num order in actions list
     * @return key of action (to execute it)
     */
    public int getActionKey(int numOrder) {
        return this.actions.get(numOrder).key();
    }

    /**
     *  Method "select" executes action by it's key
     * @param key key of action to execute
     */
    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    /**
     *  Method "fillActions" is filling actions list
     * @param ui StartUI
     */
    public void fillActions(StartUI ui) {
        this.actions.add(new ActionAddItem(1, "Add new Item"));
        this.actions.add(new ActionShowAllItems(2, "Show all items"));
        this.actions.add(new MenuTracker.ActionEditItem(3, "Edit item"));
        this.actions.add(new MenuTracker.ActionDeleteItem(4, "Delete Item"));
        this.actions.add(new ActionFindItemById(5, "Find Item by id"));
        this.actions.add(new ActionFindItemsByName(6, "Find Items by name"));
        this.actions.add(new ActionExitProgram(7, "Exit program", ui));
    }

    public List<Integer> getActionsRange() {
        List<Integer> range = new ArrayList<>();
        for (int i = 0; i < this.getActionLength(); i++) {
            range.add(this.getActionKey(i));
        }
        return range;
    }

    public void show() {
        StringBuilder menu = new StringBuilder(
                System.lineSeparator())
                .append("Menu:")
                .append(System.lineSeparator());
        for (UserAction action : this.actions) {
            if (action != null) {
                menu.append(action.info()).append(System.lineSeparator());
            }
        }
        System.out.println(menu.toString());
    }

    public class ActionShowAllItems implements UserAction {
        private int key;
        private String info;

        public ActionShowAllItems(int key, String info) {
            this.key = key;
            this.info = info;
        }

        public int key() {
            return this.key;
        }

        public String info() {
            return String.format("%d. %s", this.key(), this.info);
        }

        public void execute(Input input, Tracker tracker) {
            Item[] find = tracker.findAll();
            if (find.length > 0) {
                for (Item item : find) {
                    System.out.println(item.toString());
                }
            } else {
                System.out.println("FIND ALL: There are no items to find. Tracker is empty");
            }
        }
    }

    public static class ActionEditItem implements UserAction {
        private int key;
        private String info;

        public ActionEditItem(int key, String info) {
            this.key = key;
            this.info = info;
        }

        public int key() {
            return this.key;
        }

        public String info() {
            return String.format("%d. %s", this.key(), this.info);
        }

        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Enter id of Item to edit: ");
            Item edit = tracker.findById(id);
            if (edit != null) {
                edit.setName(input.ask("Enter new Item name: "));
                if (tracker.replace(id, edit)) {
                    System.out.println("EDIT: Success. " + edit.toString());
                } else {
                    System.out.println("EDIT: Fail. Unknown fail.");
                }
            } else {
                System.out.println("EDIT: Fail. There are no Item with id - " + id);
            }
        }
    }

    public static class ActionDeleteItem implements UserAction {
        private int key;
        private String info;

        public ActionDeleteItem(int key, String info) {
            this.key = key;
            this.info = info;
        }

        public int key() {
            return this.key;
        }

        public String info() {
            return String.format("%d. %s", this.key(), this.info);
        }

        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Enter id of Item to delete: ");
            if (tracker.findById(id) != null) {
                if (tracker.delete(id)) {
                    System.out.println("DELETE: Success");
                } else {
                    System.out.println("DELETE: Fail. Unknown fail.");
                }
            } else {
                System.out.println("DELETE: Fail. There are no Item with id - " + id);
            }
        }
    }

    public class ActionFindItemById implements UserAction {
        private int key;
        private String info;

        public ActionFindItemById(int key, String info) {
            this.key = key;
            this.info = info;
        }

        public int key() {
            return this.key;
        }

        public String info() {
            return String.format("%d. %s", this.key(), this.info);
        }

        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Enter id of Item to find: ");
            Item item = tracker.findById(id);
            if (item != null) {
                System.out.println(item.toString());
            } else {
                System.out.println("FIND BY ID: item not found. id - " + id + "Doesn't exist");
            }
        }
    }

    public class ActionFindItemsByName implements UserAction {
        private int key;
        private String info;

        public ActionFindItemsByName(int key, String info) {
            this.key = key;
            this.info = info;
        }

        public int key() {
            return this.key;
        }

        public String info() {
            return String.format("%d. %s", this.key(), this.info);
        }

        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Enter name of items to find: ");
            Item[] find = tracker.findByName(name);
            if (find.length > 0) {
                for (Item item : find) {
                    System.out.println(item.toString());
                }
            } else {
                System.out.println("FIND BY NAME: item not found. Item with name \"" + name + "\" isn't exist");
            }
        }
    }

    public class ActionExitProgram implements UserAction {
        private int key;
        private String info;
        private final StartUI ui;

        public ActionExitProgram(int key, String info, StartUI ui) {
            this.key = key;
            this.info = info;
            this.ui = ui;
        }

        public int key() {
            return this.key;
        }

        public String info() {
            return String.format("%d. %s", this.key(), this.info);
        }

        public void execute(Input input, Tracker tracker) {
           ui.setIsWorking(false);
        }
    }
}

class ActionAddItem implements UserAction {
    private int key;
    private String info;

    public ActionAddItem(int key, String info) {
        this.key = key;
        this.info = info;
    }

    public int key() {
        return this.key;
    }

    public String info() {
        return String.format("%d. %s", this.key(), this.info);
    }

    public void execute(Input input, Tracker tracker) {
        tracker.addItem(new Item(input.ask("enter new Item name: ")));
    }
}
