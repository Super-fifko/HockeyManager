package org.example.players;

public abstract class Player {
    private String name;
    private int age;

    public abstract void addAmount();   //function that adds to whatever the players are required to have
                                        // named as it is for abstraction purposes
    public abstract void getPlayerInfo();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
