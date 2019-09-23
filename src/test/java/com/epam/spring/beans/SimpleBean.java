package com.epam.spring.beans;

public class SimpleBean {
    private String name;

    public SimpleBean (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
}
