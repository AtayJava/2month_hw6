package com.company;

public class Family <T extends Number> implements Countable<Number> {

    private Number person;


    @Override
    public void addPerson(Number person) {
        this.person = person;

    }

    @Override
    public Number count() {
        return 100;
    }
}
