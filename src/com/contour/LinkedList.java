package com.contour;

public class LinkedList {
    Node head;

    // Adding data at end
    public void insert(int data) {
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(null);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(true) {
                if (temp.getNext() != null) { temp = temp.getNext(); } else { temp.setNext(newNode); }
            }
        }
    }

    // returns the length of linked list
    public void length() {

    }

    //Traversing Linked list
    public void traverse() {
        Node temp = head;
        while (true) {
            System.out.print(temp.getData());
            if (temp.getNext() == null) { break; }
            temp.setNext(temp.getNext());
        }
    }
}
