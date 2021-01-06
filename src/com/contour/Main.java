package com.contour;

import com.contour.datastructures.LinkedList;
import com.contour.datastructures.Stack;
import com.contour.organization.Employee;
import com.contour.organization.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Store only Integers
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        // Store dynamic data
        ArrayList list = new ArrayList(); // OR // ArrayList<Object> list = new ArrayList<Object>();
        list.add("osama");
        list.add(21);
        list.add(12.90);

        // Printing
        System.out.println("Integer List: " + integerList);
        System.out.println("Integer List: " + list);

        // getting data from arraylist
        int age = integerList.get(0);
        Object data = list.get(0); // using object since we don't know the type.
        System.out.println(age + " " + data);

        // Updating values
        list.set(0, "hadi");
        System.out.println("New List: " + list);

        // Contains function
        System.out.println(list.contains(12.9));

        // iteration
        for (short i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // iteration using enhanced for loop
        for (Object o : list) {
            System.out.print(o + " ");
        }

        // printing using iterator
        Iterator<Integer> it = integerList.iterator();
        System.out.print(it.next() + " ");
        System.out.print(it.next() + " ");
        System.out.print(it.next() + " ");

        // iterating through interator, removing element
        while (it.hasNext()) {
            int num = it.next();
            if (num == 4) {
                it.remove();
            }
        }
        System.out.println(integerList);
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