package com.contour;

public class Node {
    private Node next;
    private int data;

    // Getters
    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    // Setters
    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
