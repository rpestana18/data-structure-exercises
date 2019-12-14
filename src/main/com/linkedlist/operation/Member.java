package main.com.linkedlist.operation;

import main.com.linkedlist.model.Player;

/**
 * Class to represent a member of the Linked List
 * @author Rodrigo Pestana
 */
public class Member {

    private Player player;
    private Member nextPlayer;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Member getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer(Member nextPlayer) {
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
