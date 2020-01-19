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

    public long[] getList() {
        return array;
    }

    public void sort() {
        for (int i = 0; i < sizeOfArray - 1; i++) {
            int index = i;

            for (int j = i + 1; j < sizeOfArray; j++)
                if (array[j] < array[index])
                    index = j; //searching for lowest index

            long smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }

    public void swap(int firstElement, int secondElement) {
        long element = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = element;

    }
}
