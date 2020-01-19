package com.sequentialsearch.operation;

public class SequencialSearch {

    private int[] array;
    private int numberOfNodes;

    public SequencialSearch() {
        array = new int[9999999];
        numberOfNodes = 0;
    }

    public void insert() {
        for (int i = 0; i < 9999998; i++) {
            array[numberOfNodes++] = i;
        }
    }

    public void search(long element) {
        int position;
        for (position = 0; position < numberOfNodes - 1; position++) {
            if ((array[position] == element) || (position == numberOfNodes))//sequential search
                break;
        }
        if (array[position] == element) {
            System.out.println("Found " + array[position] + " at the position " + position + " of array");
        } else
            System.out.println("Number not found");

    }
}
