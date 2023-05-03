package org.example.players;

public class Goalie extends Player{
    private int winsAmount=0;

    public void getPlayerInfo(){
        System.out.println("Name: "+ this.getName());
        System.out.println("Age: "+ this.getAge());
        System.out.println("A number of hits: "+ this.getWinsAmount());
    }

    public void addAmount(){
        this.winsAmount++;
    }
    public int getWinsAmount() {
        return winsAmount;
    }

    public void setWinsAmount(int winsAmount) {
        this.winsAmount = winsAmount;
    }

    public Goalie(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    public Goalie(String name, int age, int winsAmount){
        this.setName(name);
        this.setAge(age);
        this.setWinsAmount(winsAmount);
    }
}
