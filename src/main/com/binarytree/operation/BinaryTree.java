package com.binarytree.operation;

import java.util.Stack;

public class BinaryTree {

    private TreeLeaf root;

    public BinaryTree(){
        root = null;
    }

    public TreeLeaf find(int key){
        TreeLeaf current = root;
        while(current.iData != key){
            if (key < current.iData)
                current = current.nextLeft;
            else
                current = current.nextRight;
            if (current ==null)
                return null;
        }
        return current;
    }

    public void insert(int element, double dd){
        TreeLeaf leaf = new TreeLeaf();
        leaf.iData = element;
        leaf.dData = dd;
        if(root ==null)
            root = leaf;
        else {
            TreeLeaf current = root;
            TreeLeaf relative;
            while(true){
                relative = current;
                if(element < current.iData){
                    current = current.nextLeft;
                    if(current ==null){
                        relative.nextLeft = leaf;
                        return;
                    }
                } else{
                    current = current.nextRight;
                    if(current == null){
                        relative.nextRight = leaf;
                        return;
                    }
                }
            }
        }
    }


    public boolean remove(int key){
        TreeLeaf current = root;
        TreeLeaf relative = root;
        boolean isNextLeft = true;

        while(current.iData != key){
            relative = current;
            if(key < current.iData){
                isNextLeft = true;
                current = current.nextLeft;
            }
            else{
                isNextLeft = false;
                current = current.nextRight;
            }
            if(current == null)
                return false;
        }
        if(current.nextLeft == null && current.nextRight == null){
            if(current == root)
                root = null;
            else if (isNextLeft)
                relative.nextLeft = null;
            else
                relative.nextRight = null;
        }
        else if(current.nextRight == null)
            if(current == root)
                root = current.nextLeft;
            else if(isNextLeft)
                relative.nextLeft = current.nextLeft;
            else
                relative.nextRight = current.nextLeft;

        else if(current.nextLeft == null)
            if(current == root)
                root = current.nextRight;
            else if(isNextLeft)
                relative.nextLeft = current.nextRight;
            else
                relative.nextRight = current.nextRight;
        else{
            TreeLeaf sucessor = newSuccessor(current);
            if(current == root)
                root = sucessor;
            else if(isNextLeft)
                relative.nextLeft = sucessor;
            else
                relative.nextRight = sucessor;
        }
        return true;
    }

    private TreeLeaf newSuccessor(TreeLeaf leaf){
        TreeLeaf successorRelative = leaf;
        TreeLeaf successor = leaf;
        TreeLeaf current = leaf.nextRight;
        while(current != null){
            successorRelative = successor;
            successor = current;
            current = current.nextLeft;
        }

        if(successor != leaf.nextRight){
            successorRelative.nextLeft = successorRelative.nextRight;
            successor.nextRight = leaf.nextRight;
        }
        return successor;
    }

    public void crossing(int crossingType){
        switch(crossingType){
            case 1: System.out.print("\nPre order: ");
                preOrder(root);
                break;
            case 2: System.out.print("\nSymmetrical: " );
                symmetrical(root);
                break;
            case 3: System.out.print("\nPost order:" );
                postOrder(root);
                break;
        }
        System.out.println();
    }

    private void preOrder(TreeLeaf localRoot){
        if(localRoot !=null){
            System.out.print(localRoot.iData + "  ");
            preOrder(localRoot.nextLeft);
            preOrder(localRoot.nextRight);
        }
    }

    private void symmetrical(TreeLeaf localRoot){
        if(localRoot !=null){
            symmetrical(localRoot.nextLeft);
            System.out.print(localRoot.iData + "  ");
            symmetrical(localRoot.nextRight);
        }
    }

    private void postOrder(TreeLeaf localRoot){
        if(localRoot != null){
            postOrder(localRoot.nextLeft);
            postOrder(localRoot.nextRight);
            System.out.print(localRoot.iData + "  ");
        }
    }

    public void showTree(){
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean linhaVazia = false;
        System.out.println("____________________________________________________________________________");
        while(linhaVazia==false){
            Stack localStack = new Stack();
            linhaVazia = true;

            for (int j=0; j<nBlanks; j++)
                System.out.print(' ');

            while(globalStack.isEmpty()==false){
                TreeLeaf temp = (TreeLeaf)globalStack.pop();
                if(temp !=null){
                    System.out.print(temp.iData);
                    localStack.push(temp.nextLeft);
                    localStack.push(temp.nextRight);

                    if(temp.nextLeft !=null || temp.nextRight !=null)
                        linhaVazia = false;
                }
                else{
                    System.out.print(" - ");
                    localStack.push(null);
                    localStack.push(null);
                }
                for(int i=0;i<nBlanks*3-3;i++)
                    System.out.print(' ');
            }
            System.out.println();

            nBlanks /=2;
            while(localStack.isEmpty()==false)
                globalStack.push(localStack.pop());
        }
        System.out.println("____________________________________________________________________________");
    }

}
