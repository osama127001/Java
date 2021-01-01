package com.contour;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Testing Linked list
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        System.out.print("\nLinkedList: ");
        list.traverse();
        System.out.println("\nLength: " + list.length());
        System.out.println("Search element index: " + list.search(5));
        list.delete(4);
        list.traverse();

    }
}
