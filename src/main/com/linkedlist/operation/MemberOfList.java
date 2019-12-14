package main.com.linkedlist.operation;

import main.com.linkedlist.model.Player;

/**
 * Class to represent a member of the Linked List
 * @author Rodrigo Pestana
 */
public class MemberOfList {

    private Player player;
    private main.com.linkedlist.operation.MemberOfList nextPlayer;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public main.com.linkedlist.operation.MemberOfList getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer(main.com.linkedlist.operation.MemberOfList nextPlayer) {
        this.nextPlayer = nextPlayer;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + player.getName() + " " +
                "age="   + player.getAge()  + " " +
                "team='" + player.getTeam() + " " +
                "} +  ====> ";
    }
}
