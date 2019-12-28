package com.binarysearch;

import com.binarysearch.operation.BinarySearch;

public class Main {

    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();
        binarySearch.insert();
        System.out.println(binarySearch.search(67));

    }
}
