package com.bubblesort.operation;

public class BubbleSort {
    private int numberOfNodes;
    private long array[];
    private int arraySize;

    public BubbleSort(int arraySize) {
        this.arraySize = arraySize;
        numberOfNodes = 0;
        array = new long[arraySize];
    }

    public void insert() {
        for (long i = arraySize; i > 0; i--) {
            array[numberOfNodes++] = i;
        }
    }

    public long[] getList() {
        return array;
    }

    public long getFirstElement() {
        return array[0];
    }

    public long getLastElement() {
        return array[numberOfNodes - 1];
    }

    public void sort() {
        int in, out;
        for (out = numberOfNodes - 1; out > 0; out--)
            for (in = 0; in < out; in++)
                if (array[in] > array[in + 1])
                    change(in, in + 1);
    }

    public void change(int first, int second) {
        long temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}



