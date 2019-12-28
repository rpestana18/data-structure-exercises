package com.doublylinkedlist;

import com.doublylinkedlist.model.Product;
import com.doublylinkedlist.operation.DoublyLinkedList;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.insertAtTheBeginning(new Product(3, "ball", 10.5));
        doublyLinkedList.insertAtTheBeginning(new Product(2, "car", 4.99));
        doublyLinkedList.insertAtTheBeginning(new Product(1, "doll", 30.56));

        doublyLinkedList.insertAtTheEnd(new Product(4, "game", 35));
        doublyLinkedList.insertAtTheEnd(new Product(5, "piano", 42.7));
        doublyLinkedList.insertAtTheEnd(new Product(6, "puzzle", 15.8));

        doublyLinkedList.showListAtTheBeginning();
        doublyLinkedList.showListAtTheEnd();

        doublyLinkedList.removeAtTheBeginning();
        System.out.println("removeAtTheBeginning()");
        doublyLinkedList.removeAtTheEnd();
        System.out.println("removeAtTheEnd()");
        doublyLinkedList.removeByKey(4);
        System.out.println("removeByKey(4)");

        doublyLinkedList.showListAtTheBeginning();

        doublyLinkedList.insertAfterMember(3, new Product(4, "baloon", 5));
        doublyLinkedList.insertAfterMember(5, new Product(7, "guitar", 99));

        doublyLinkedList.showListAtTheBeginning();

    }
}
