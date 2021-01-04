package com.contour.datastructures;

public class LinkedList extends DataStructure implements IDataStructure {

    // Adding data at end
    public void insert(int data) {
        super.insert(data);
    }

    // returns the length of linked list
    public int length() {
        return super.length();
    }

    //Traversing Linked list
    public void traverse() {
        if (super.head == null) {
            System.out.println("Stack is empty!");
            return;
        }
        super.traverse();
    }

    // Search Function
    public int search(int data) {
        return super.search(data);
    }

    // delete node of linked list using index
    public void delete(int index) {
        super.delete(index);
    }
}
