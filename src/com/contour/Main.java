package com.contour;

import com.contour.datastructures.LinkedList;
import com.contour.datastructures.Stack;
import com.contour.organization.Employee;
import com.contour.organization.Person;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Normal Instantiations
        Person P = new Person();
        Employee E = new Employee();

        // Instantiations with parent classes/interfaces.
        Object OP = new Person(); // Object is the parent of every class.
        Person PE = new Employee();

        // Accessing methods
        P.getName(); // allowed
        P.getSalary(); // getSalary() is a method in employee, not allowed (error)
        O.getName(); // Not allowed.

        // To make a parent object access the child's method, use typecasting
        ((Person)O).getName(); // Now this will work.
        ((Employee)P).getSalary(); // Now this will work.

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