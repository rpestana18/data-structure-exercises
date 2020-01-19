package com.mergesort.operation;

public class MergeSort {

    private long[] array;
    private int numberOfNodes;
    private int sizeOfArray;

    public MergeSort(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
        array = new long[sizeOfArray];
        numberOfNodes = 0;
    }

    public void insert() {
        for (long i = sizeOfArray; i > 0; i--)
            array[numberOfNodes++] = i;

    }

    public long[] getList() {
        return array;
    }

    public void exeMergeSort(){
        long temporaryArray[] = new long[numberOfNodes];
        mergeSort(temporaryArray,0,numberOfNodes-1);
    }


    private void mergeSort(long[] temporaryArray, int low, int high) {

        if (low == high)
            return;

        else {
            int middle = (low + high) / 2;

            mergeSort(temporaryArray, low, middle);
            mergeSort(temporaryArray, middle + 1, high);

            merge(temporaryArray, low, middle + 1, high);
        }

    }

    public void merge(long[] temporaryArray, int low, int high, int end) {
        int j = 0;
        int start = low;
        int middle = high - 1;
        int n = end - start + 1;

        while (low <= middle && high <= end)
            if (array[low] < array[high])
                temporaryArray[j++] = array[low++];
            else
                temporaryArray[j++] = array[high++];

        while (low <= middle)
            temporaryArray[j++] = array[low++];

        while (high <= end)
            temporaryArray[j++] = array[high++];

        for (j = 0; j < n; j++)
            array[start + j] = temporaryArray[j];
    }
}
