package com.example.reservationmanager.domain.model;

public class Base {
    int id;
    String name;

    public Base(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }
}
