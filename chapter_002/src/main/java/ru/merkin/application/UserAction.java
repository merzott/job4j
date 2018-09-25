package ru.merkin.application;

/**
 * Interface "UserAction" describes user action model.
 */
public interface UserAction {
    /**
     * Method "key" is needed to get key number of the user action.(menu item number)
     * @return key number of the user action
     */
    int key();

    /**
     * Method "execute" is body of UserAction, it executes set of action, wich UserAction object was created to.
     * @param input Input object
     * @param tracker Tracker object
     * @return true if action is not final and further work is expected, false if action is final(like "exit")
     */
    void execute(Input input, Tracker tracker);

    /**
     * Method "info" is inform what UserAction is doing(menu item name)
     * @return String
     */
    String info();
}
