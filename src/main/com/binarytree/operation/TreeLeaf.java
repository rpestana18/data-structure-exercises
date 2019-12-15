package com.binarytree.operation;

public class TreeLeaf {

    public int iData;
    public double dData;
    public TreeLeaf nextLeft;
    public TreeLeaf nextRight;

    public void printLeaf(){
        System.out.print(" {" );
        System.out.print(" iData ");
        System.out.print(",  ");
        System.out.print(dData);
        System.out.print("}  ");
    }
}
