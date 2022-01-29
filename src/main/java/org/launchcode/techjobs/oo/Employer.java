package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer {

    private int id;
    private static int nextId = 1;//does not store  any value within employer
    private String value;

    public Employer() {//assigns value of nextId to id.so each new Employer with get a different id number
        id = nextId;
        nextId++;
    }

    public Employer(String value) {//assigns aValue to value field and initializes id  for the object calling th first constructor with  this();
        this();// calling this(); in constructor  makes initalizing  id a default bevhavior
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
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
