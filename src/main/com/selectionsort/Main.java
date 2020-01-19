package com.selectionsort;

import com.selectionsort.operation.SelectionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort(10);
        System.out.println("Let's insert some values");
        selectionSort.insert();

        System.out.println();
        System.out.print("Before to sort: ");
        Arrays.stream(selectionSort.getList()).forEach(i -> System.out.print(i + " "));

        System.out.println();
        System.out.println();
        System.out.println("Let's sort");
        selectionSort.sort();
        System.out.println();

        System.out.print("After to sort: ");
        Arrays.stream(selectionSort.getList()).forEach(i -> System.out.print(i + " "));
        System.out.println();

        System.out.println("Executed successfully!");

    }

}
