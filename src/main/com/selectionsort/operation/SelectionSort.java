package com.selectionsort.operation;

public class SelectionSort {

    private int numberOfNodes;
    private long array[];
    private int sizeOfArray;

    public SelectionSort(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
        numberOfNodes = 0;
        array = new long[sizeOfArray];
    }

    public void insert() {
        for (long i = sizeOfArray; i > 0; i--)
            array[numberOfNodes++] = i;
    }

    public long[] getList(){
        return array;
    }

    public void sort() {
        int in, out;
        for (out = numberOfNodes - 1; out > 0; out--)
            for (in = 0; in < out; in++)
                if (array[in] > array[in + 1])
                    swap(in, in + 1);
    }

    public void swap(int firstElement, int secondElement) {
        long element = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = element;

    }
}
