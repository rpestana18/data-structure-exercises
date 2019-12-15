package com.binarytree;

import com.binarytree.operation.BinaryTree;
import com.binarytree.operation.TreeLeaf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String [] args) throws IOException {
        int value;
        BinaryTree a = new BinaryTree();

        while(true){
            System.out.print("Enter the first letter of your choice:\n ");
            System.out.print(" Insert, Find, Remove, Crossing, ShowTree, Exit: ");
            int choice = getChar();
            switch(choice){
                case 's':
                    a.showTree();
                    break;
                case 'i':
                    System.out.print("Inform the number that you would like to insert: ");
                    value = getInt();
                    a.insert(value, value + 0.9);
                    break;

                case 'f':
                    System.out.print("Inform the number that you would like to find");
                    value = getInt();
                    TreeLeaf found = a.find(value);
                    if(found !=null){
                        System.out.print("Found: ");
                        found.printLeaf();
                        System.out.print("\n");
                    } else
                        System.out.print("Not Found ");
                    System.out.print(value +"\n");
                    break;



                case'r':
                    System.out.print("Inform the number that you would like to remove: ");
                    value = getInt();
                    boolean numRemover = a.remove(value);
                    if(numRemover)
                        System.out.print("Removed "+value +"\n");
                    else
                        System.out.print("Not Found");
                    System.out.print(value + "\n");
                    break;
                case 'c':
                    System.out.print("Type,\n 1-Pre Order\n 2-Symmetrical\n 3-Post Order");
                    value = getInt();
                    a.crossing(value);
                    break;
                case 'e':
                    System.out.println("Bye Bye!");
                    System.exit(0);
                    break;
            }
        }
    }
    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
    public static char getChar()throws IOException{
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt()throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
    }
