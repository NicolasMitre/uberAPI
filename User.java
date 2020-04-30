package com.company;

public abstract class User {
    public User(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private byte age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
