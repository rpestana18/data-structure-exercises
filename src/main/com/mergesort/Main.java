package com.mergesort;

import com.mergesort.operation.MergeSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        MergeSort mergeSort = new MergeSort(10);
        System.out.println("Let's insert some values");
        mergeSort.insert();

        System.out.println();
        System.out.print("Before to sort: ");
        Arrays.stream(mergeSort.getList()).forEach(i -> System.out.print(i +" "));

        System.out.println();
        System.out.println();
        System.out.println("Let's sort");
        mergeSort.exeMergeSort();
        System.out.println();

        System.out.print("After to sort: ");
        Arrays.stream(mergeSort.getList()).forEach(i -> System.out.print(i +" "));
        System.out.println();

        System.out.println("Executed successfully!");

    }
}
