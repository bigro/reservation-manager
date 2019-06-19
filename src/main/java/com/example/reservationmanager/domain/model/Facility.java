package com.example.reservationmanager.domain.model;

public class Facility {
    int id;
    String name;
    Base base;

    public Facility(int id, String name, Base base) {
        this.id = id;
        this.name = name;
        this.base = base;
    }

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }

    public Base base() {
        return base;
    }
}
