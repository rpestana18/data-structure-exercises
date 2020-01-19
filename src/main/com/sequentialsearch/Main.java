package com.sequentialsearch;

import com.sequentialsearch.operation.SequencialSearch;

public class Main {

    public static void main(String[] args) {

        SequencialSearch sequencialSearch = new SequencialSearch();
        System.out.println("Let's inert some values to test first");
        sequencialSearch.insert();
        System.out.println("Done! Now, let's test the search");

        sequencialSearch.search(0);

        System.out.println("Search executed successfully!");

    }
}
