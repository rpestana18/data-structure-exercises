package com.linkedlist;
import main.com.linkedlist.model.Player;
import main.com.linkedlist.operation.LinkedList;
import main.com.linkedlist.util.GenerateMembers;
import main.com.linkedlist.util.Interface;

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
