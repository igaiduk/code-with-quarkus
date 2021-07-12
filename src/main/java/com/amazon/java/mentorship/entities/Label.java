package com.amazon.java.mentorship.entities;


public class Label {
    private static int count = 0;
    private int id;
    private String name;

    public Label(String name) {
        this.id = ++count;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Label{" +
                "id=" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

