package com.quicksort.operation;

public class QuickSort {

    private long array[];
    private int numberOfNodes;
    private int arraySize;

    public QuickSort(int arraySize) {
        this.arraySize = arraySize;
        array = new long[arraySize];
        numberOfNodes = 0;
    }

    public void insert() {
        for (long i = arraySize; i > 0; i--)
            array[numberOfNodes++] = i;
    }

    public long[] getList() {
        return array;
    }

    public void exeQuickSort() {
        quickSort(0, numberOfNodes - 1);
    }

    public void quickSort(int left, int right) {

        if (right - left <= 0)
            return;

        else {
            long pivot = array[right];

            int partitionPosition = partition(left, right, pivot);
            quickSort(left, partitionPosition - 1);
            quickSort(partitionPosition + 1, right);
        }
    }

    public int partition(int left, int right, long pivot) {
        int leftP = left - 1;
        int rightP = right;
        while (true) {
            while (array[++leftP] < pivot);//(no operation)

            while (rightP > 0 && array[--rightP] > pivot);// (no operation)

            if (leftP >= rightP)
                break;
            else
                swap(leftP, rightP);
        }
        swap(leftP, right);
        return leftP;
    }

    public void swap(int firstElement, int secondElement) {
        long element = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = element;
    }

}
