package com.linkedlist.operation;

import com.linkedlist.model.Player;

/**
 * Class to represent a member of the Linked List
 * @author Rodrigo Pestana
 */
public class MemberOfList {

    private Player player;
    private MemberOfList nextPlayer;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public MemberOfList getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer(MemberOfList nextPlayer) {
        this.nextPlayer = nextPlayer;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + player.getName() + " " +
                "age="   + player.getAge()  + " " +
                "team='" + player.getTeam() + " " +
                "} + > ";
    }
}
