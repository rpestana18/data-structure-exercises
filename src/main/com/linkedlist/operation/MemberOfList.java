package com.linkedlist.operation;

import com.linkedlist.model.Player;

/**
 * Class to represent a member of the Linked List
 * @author Rodrigo Pestana
 */
public class MemberOfList {

    private Player player;
    private MemberOfList nextMember;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public MemberOfList getNextMember() {
        return nextMember;
    }

    public void setNextMember(MemberOfList nextMember) {
        this.nextMember = nextMember;
    }

    @Override
    public String toString() {
        return "Member{\n" +
                "Player name='" + player.getName() + "\n" +
                "Player age="   + player.getAge()  + "\n" +
                "Player team='" + player.getTeam() + "\n" +
                "} + > ";
    }
}
