# Data Structure Exercises
A repository to put all exercises about data structure (lists, queues, trees)

Here you can find some exercises about data structure developed in some languages in order to 
understand the logic of these structures and their implementation with different languages and their resources.


**1 - Linked list**

List with dynamic allocation of memory. 
This list is composted by nodes and every node has the reference (address) of the next node of the list. 
In case of this reference has the null value, so this node is the last node of the list.


Explaining the code
Package model: in our example we are creating a list of team members of games. We have the object Player to represent the value of every node.

Package operation: for the operation of the list we have two classes: LinkedList that is the class with all methods to create and to manipulate the list and MemberOfList class to maintain the nodes of the list.
The MemberOfList class is the class responsible for represent the value of the node (Player) and to have the reference of the next MemberOfList.

Package util: classes to be used to execute our list with a simple example of values in order to verify the functionality. GeneratePlayers returns a list of Players to be part of the list and Interface is just a class to show the list.

The Main class execute our example.




**2 - Doubly Linked List**

Almost the same of the linked list but with the difference that each member of the list has the previous member reference.




**3 - Binary tree**

Binary tree is a data structure in the form of a tree composed of nodes, being constructed in such a way that the nodes of the subtree on the left always go below the root and all nodes of the right subtree have a value greater than the root.
As the nodes are inserted in the tree, the values ​​are distributed. The first to be inserted is the root node and from the others it will be distributed throughout the structure.
Main features:
 - The nodes that are above are known as "father" of the nodes below them.
 - A node that has no children is called a leaf.
 - Height or depth of a node is the distance from the node to the root.
 - The degree of a node is the number of children that the node has.
 - The degree of a tree is the maximum number that the

 The main use of binary trees is binary search trees. In a binary search tree, the three paths that can be taken for any binary tree can be made
- symmetrical (inordinate paths)
- pre-order
- post-order




**Binary Search**
to write

**Sequential Search**
to write

**Bubble Sort**
to write

**Merge Sort**
to write

**Quick Sort**
to write

**Selection Sort**
to write
