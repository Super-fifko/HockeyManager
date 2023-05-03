package org.example.players;

public class Defender extends Player{
    private int hitsAmount=0;

    public void getPlayerInfo(){
        System.out.println("Name: "+ this.getName());
        System.out.println("Age: "+ this.getAge());
        System.out.println("A number of hits: "+ this.getHitsAmount());
    }
    public void addAmount(){
        this.hitsAmount++;
    }
    public int getHitsAmount() {
        return hitsAmount;
    }

    public void setHitsAmount(int hitsAmount) {
        this.hitsAmount = hitsAmount;
    }

    public Defender(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    public Defender(String name, int age, int hitsAmount){
        this.setName(name);
        this.setAge(age);
        this.setHitsAmount(hitsAmount);
    }


}
