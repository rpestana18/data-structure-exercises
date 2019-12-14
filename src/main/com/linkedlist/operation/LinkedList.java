package main.com.linkedlist.operation;

import main.com.linkedlist.model.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to generate and maintain the linked list
 * @author Rodrigo Pestana
 */
public class LinkedList {

    private Member topOfList;
    private Member newMember;

    public LinkedList() {
        this.topOfList = null;
    }

    /**
     * @return return a list with all members of the linked list
     */
    public List<Member> listMembers() {
        List<Member> members = null;
        Member member = null;

        if (topOfList != null) {
            members = new ArrayList<>();
            member = topOfList;

            while (member != null) {
                members.add(member);
                member = member.getNextPlayer();
            }
            return members;
        }else
            return members;

    }

    /**
     * To insert a new item on the linked list you need to create a new item,
     * put the item received by parameter in this item (setPlayer)
     * and set the next item on the new item object to null (setNextPlayer)
     * in order to inform that this new player is the last player
     * If the topOfList id null than this new player is the first player of the list.
     * If not, than we need to identify the last member of the list and put the new member after him.
     * @param player
     */
    public void insertNewPlayer(Player player) {
        newMember = new Member();
        newMember.setPlayer(player);
        newMember.setNextPlayer(null);

        if (topOfList == null)
            topOfList = newMember;
        else {
            Member member = topOfList;
            while (member.getNextPlayer() instanceof Member) {
                member = member.getNextPlayer();
            }
            //once the last member identified, we can put the new member on the last position
            member.setNextPlayer(newMember);
        }
    }

    public Player removePlayer(Player player) {
        return player;
    }


    public boolean isEmpty() {
        return this.topOfList == null; // if null this item is the top of the lists
    }
}
