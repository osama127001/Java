package com.contour;

import com.contour.datastructures.LinkedList;
import com.contour.datastructures.Stack;
import com.contour.organization.Employee;
import com.contour.organization.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Creating hashmap
        // It contains other functions just like arraylist.
        // Hashmaps do not have an order
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("osama", 123);
        hm.put("hadi", 12);
        hm.put("aamir", 1);
        System.out.println(hm);
        System.out.println(hm.get("hadi"));
        hm.remove("aamir");
        System.out.println(hm);
        System.out.println(hm.containsKey("osama"));
        System.out.println(hm.containsValue(123));
        hm.replace("hadi", 3434);
        System.out.println(hm);
        System.out.println(hm.keySet());


    }
}





























































//// Testing Linked list
//        System.out.println("\n********** Linkedlist **********");
//                LinkedList list = new LinkedList();
//                list.insert(5);
//                list.insert(4);
//                list.insert(3);
//                list.insert(2);
//                list.insert(1);
//                System.out.print("LinkedList: ");
//                list.traverse();
//                System.out.println("\nLength: " + list.length());
//                System.out.println("Search element index: " + list.search(5));
//                list.delete(4);
//                list.traverse();
//
//                // Testing Stack
//                System.out.println("\n\n********** Stack ***************");
//                Stack stack = new Stack();
//                stack.insert(1);
//                stack.insert(2);
//                stack.insert(3);
//                stack.insert(66);
//                System.out.print("Stack: ");
//                stack.traverse();
//                System.out.println("\nLength: " + stack.length());
//                System.out.println("Search element index: " + stack.search(66));
//                stack.delete();
//                stack.traverse();
//                System.out.println("");
//                stack.delete();
//                stack.traverse();
//                System.out.println("");
//                stack.delete();
//                stack.traverse();
//                System.out.println("");
//                stack.delete();
//                stack.traverse();