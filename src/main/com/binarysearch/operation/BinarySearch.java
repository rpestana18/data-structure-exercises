package com.binarysearch.operation;

public class BinarySearch {

    private int [] values;
    private int numberOfNodes;

    public BinarySearch() {
        values = new int[9999999];
        numberOfNodes = 0;
    }

    public void insert(){
        for(int i=0;i<9999998;i++){
            values[numberOfNodes++] = i;
        }
    }

    public int search(int key){
        int start = 0, end = numberOfNodes -1, middle;

        while(true)
        {
            middle = (start + end) / 2;

            if(values[middle] == key)
                return middle; //found

            else if (start > end)
                return numberOfNodes; //not found

            else //divide
            {
                if(values[middle] < key)
                    start = middle + 1;//it's at the second part
                else
                    end = middle - 1;//it's at the first part
            }
        }
    }
}
