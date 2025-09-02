package edu.polymorphism.ex2.model;

public class UniverseMember {

    protected String name;
    protected String ID;

    public UniverseMember() {}

    public UniverseMember(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }



}
