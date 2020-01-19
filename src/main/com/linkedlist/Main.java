package com.linkedlist;

import com.linkedlist.operation.LinkedList;
import com.linkedlist.util.GeneratePlayers;
import com.linkedlist.util.Interface;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        GeneratePlayers.generateList().forEach(i -> list.insertNewMember(i));

        Interface.showMemberOfTheLinkedList(list.listMembers());
    }
}
