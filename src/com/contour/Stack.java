package com.contour;

public class Stack extends DataStructure implements IDataStructure{

    // insert at end in stack
    @Override
    public void insert(int data) {
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(null);
        if(super.head == null) {
            head = newNode;
        } else {
            Node temp = super.head;
            while(temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    // returns the length of the stack
    public int length() {
        return super.length();
    }

    // deletes an element at the end in stack
    public void delete() {
        if (super.head == null) {
            System.out.println("Nothing in stack");
        } else if (this.length() == 1) {
            super.head = null;
        } else {
            Node temp = super.head;
            while(temp.getNext().getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(null);
        }
    }

    // traversing the stack
    public void traverse() {
        if (super.head == null) {
            System.out.println("Stack is empty!");
            return;
        }
        super.traverse();
    }

    // searching the stack
    public int search(int data) {
        return super.search(data);
    }

}
