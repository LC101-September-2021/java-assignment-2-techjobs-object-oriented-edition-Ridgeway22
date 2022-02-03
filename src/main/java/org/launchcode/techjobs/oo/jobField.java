package org.launchcode.techjobs.oo;

public abstract class jobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public jobField() {
        id = nextId;
        nextId++;
    }

    public jobField(String value) {
        this();
        this.value = value;
    }
    public String toString() {
        return value;
   }
// Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
