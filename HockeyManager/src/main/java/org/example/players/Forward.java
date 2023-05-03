package org.example.players;

public class Forward extends Player{
    private int goalAmount=0;
    public void getPlayerInfo(){
        System.out.println("Name: "+ this.getName());
        System.out.println("Age: "+ this.getAge());
        System.out.println("A number of hits: "+ this.getGoalAmount());
    }

    public void addAmount(){
        this.goalAmount++;
    }
    public int getGoalAmount() {
        return goalAmount;
    }

    public void setGoalAmount(int goalAmount) {
        this.goalAmount = goalAmount;
    }

    public Forward(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    public Forward(String name, int age, int goalAmount){
        this.setName(name);
        this.setAge(age);
        this.setGoalAmount(goalAmount);
    }
}
