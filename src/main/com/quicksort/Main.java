package com.quicksort;

import com.quicksort.operation.QuickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        QuickSort quickSort = new QuickSort(10);
        System.out.println("Let's insert some values");
        quickSort.insert();

        System.out.println();
        System.out.println();
        System.out.println("Let's sort");
        quickSort.exeQuickSort();
        System.out.println();

        System.out.print("After to sort: ");
        Arrays.stream(quickSort.getList()).forEach(i -> System.out.print(i +" "));
        System.out.println();

        System.out.println("Executed successfully!");


    }
}
