package org.example;

import org.example.players.*;

import java.util.ArrayList;

public class HockeyManager {
    private ArrayList<Player> players=new ArrayList<Player>();
    public void AddNewForward(String name, int age)
    {
        Player player = new Forward(name, age);
        players.add(player);
    }
    public void AddNewForward(String name, int age, int goalAmount)
    {
        Player player = new Forward(name, age, goalAmount);
        players.add(player);
    }
    public void AddNewDefender(String name, int age)
    {
        Player player = new Defender(name, age);
        players.add(player);
    }
    public void AddNewDefender(String name, int age, int hitsAmount)
    {
        Player player = new Defender(name, age, hitsAmount);
        players.add(player);
    }

    public void AddNewGoalie(String name, int age)
    {
        Player player = new Goalie(name, age);
        players.add(player);
    }
    public void AddNewGoalie(String name, int age, int winsAmount)
    {
        Player player = new Goalie(name, age, winsAmount);
        players.add(player);
    }
    public void PrintNameAndAgeOfTheYoungestPlayer()
    {
        Player youngestPlayer=this.players.get(0);
        for(Player p : players){                    //a cycle for finding the youngest player
            if(p.getAge()<youngestPlayer.getAge()){
                youngestPlayer=p;
            }
        }
        System.out.println("Name of the youngest player: " + youngestPlayer.getName());
        System.out.println("Age of the youngest player: " + youngestPlayer.getAge());
    }

    public HockeyManager(){
        Player player = new Forward("Janko", 50, 13);
        this.players.add(player);
        player.getPlayerInfo();
        System.out.println("");
        player = new Defender("Jozko", 35);
        this.players.add(player);
        player.getPlayerInfo();
        System.out.println("");
        player = new Goalie("Ferko", 36);
        this.players.add(player);
        player.getPlayerInfo();
        System.out.println("");
        PrintNameAndAgeOfTheYoungestPlayer();
    }
}
