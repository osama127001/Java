package com.contour.datastructures;

// Linear data structures parent class.
public abstract class DataStructure implements IDataStructure {

    protected Node head;

    //Constructor
    public DataStructure() {
        head = null;
    }

    // Insertion of data in data structure
    public void insert(int data) {
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(null);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(true) {
                if (temp.getNext() != null) { temp = temp.getNext(); }
                else {
                    temp.setNext(newNode);
                    break;
                }
            }
        }
    }

    // deletion of nod in data structure
    public void delete(int index) {
        Node temp = head;
        if (index > this.length() || index < 1) {
            System.out.println("index out of bound!");
        } else if (index == 1) {
            head = head.getNext();
        } else {
            int count = 1;
            while(count < index - 1) {
                temp = temp.getNext();
                count++;
            }
            if (index == this.length()) {
                temp.setNext(null);
            } else {
                temp.setNext(temp.getNext().getNext());
            }
        }
    }

    //Traversing data structure
    public void traverse() {
        Node temp = head;
        while (true) {
            System.out.print(temp.getData());
            temp = temp.getNext();
            if (temp == null) {
                break;
            } else {
                System.out.print(" -> ");
            }
        }
    }

    // returns the length of data structure
    public int length() {
        int count = 0;
        Node temp = head;
        while (true) {
            if (temp != null) {
                count++;
                temp = temp.getNext();
            } else { return count; }
        }
    }

    // searching element in the data structure
    public int search(int data) {
        Node temp = head;
        int count = 1;
        while(true) {
            if (temp == null) {
                System.out.println("not found!");
                return -1;
            }
            if (temp.getData() == data) {
                return count;
            } else {
                temp = temp.getNext();
                count++;
            }
        }
    }

}
