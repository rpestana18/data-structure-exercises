package com.bubblesort;

import com.bubblesort.operation.BubbleSort;

import javax.swing.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort(Integer.parseInt((JOptionPane.showInputDialog("Size of the array?"))));
        bubbleSort.insert();

        System.out.print("Before to sort: ");
        Arrays.stream(bubbleSort.getList()).forEach(i -> System.out.print(i +" "));

        System.out.println();

        System.out.println("Let's sort!");
        bubbleSort.sort();
        System.out.println();

        System.out.print("After to sort:");
        Arrays.stream(bubbleSort.getList()).forEach(i -> System.out.print(i +" "));
        System.out.println();
        System.out.println("Executed successfully!");



    }
}
