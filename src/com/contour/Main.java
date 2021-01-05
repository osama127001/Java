package com.contour;

import com.contour.datastructures.LinkedList;
import com.contour.datastructures.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Testing Linked list
        System.out.println("\n********** Linkedlist **********");
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        System.out.print("LinkedList: ");
        list.traverse();
        System.out.println("\nLength: " + list.length());
        System.out.println("Search element index: " + list.search(5));
        list.delete(4);
        list.traverse();

        // Testing Stack
        System.out.println("\n\n********** Stack ***************");
        Stack stack = new Stack();
        stack.insert(1);
        stack.insert(2);
        stack.insert(3);
        stack.insert(66);
        System.out.print("Stack: ");
        stack.traverse();
        System.out.println("\nLength: " + stack.length());
        System.out.println("Search element index: " + stack.search(66));
        stack.delete();
        stack.traverse();
        System.out.println("");
        stack.delete();
        stack.traverse();
        System.out.println("");
        stack.delete();
        stack.traverse();
        System.out.println("");
        stack.delete();
        stack.traverse();

    }
}

