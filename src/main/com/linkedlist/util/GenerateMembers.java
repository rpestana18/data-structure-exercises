package com.linkedlist.util;

import main.com.linkedlist.model.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Class just to generate some Members for our test
 */
public class GenerateMembers {

    public static List<Player> generateList(){

        List<Player> players = new ArrayList<>();
        players.add(new Player("John", 17, "Team 01"));
        players.add(new Player("Marie", 18, "Team 02"));
        players.add(new Player("Peter", 15, "Team 01"));
        players.add(new Player("Joane", 116, "Team 02"));

        return players;
    }
}
