package com.contour;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Testing Linked list
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(7);
        System.out.print("\nLinkedList: ");
        list.traverse();
        System.out.println("\nLength: " + list.length());
        System.out.println("");

    }
}
