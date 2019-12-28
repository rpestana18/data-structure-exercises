package com.linkedlist;



import com.linkedlist.model.Player;
import com.linkedlist.operation.Interface;
import com.linkedlist.operation.LinkedList;
import com.linkedlist.util.GenerateMembers;


/**
 * Class to execute the linked list
 *
 * @author Rodrigo Pestana
 */
public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        for (Player player : GenerateMembers.generateList())
            list.insertNewPlayer(player);

        Interface.showMemberOfTheLinkedList(list.listMembers());
    }
}
