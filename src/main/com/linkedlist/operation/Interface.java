package com.linkedlist.operation;

import javax.swing.*;
import java.util.List;

/**
 * Class implement methods just to show the information on the JOptionPane components
 * @author Rodrigo Pestana
 */
public class Interface<E> {

    public static void showMemberOfTheLinkedList(List list){
        String message = "";
        for(Object o : list)
            message += "\n" + o.toString();

        JOptionPane.showMessageDialog(null, message);

    }
}
