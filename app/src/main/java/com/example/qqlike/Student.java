package com.example.qqlike;

import java.io.Serializable;

public class Student implements Serializable {


    private static final long serialVersionUID = -5365210544437888796L;


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }
}
