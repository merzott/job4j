package ru.merkin.application;

public class Item {
    private String name;
    private String id;

    Item(String name) {
        this.name = name;
    }

    public String toString() {
        return "id = " + this.getId() + " name = " + this.getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
