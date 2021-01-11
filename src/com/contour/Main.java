package com.contour;

import com.contour.repositorytask.DAL.Repositories.EmployeeRepository;
import com.contour.repositorytask.DL.Employee;
import com.contour.repositorytask.DAL.Repositories.Repository;

import java.util.*;


public class Main {
    static int count = 0;

    public static void main(String[] args) {
	// write your code here

        // Creating objects
        Employee e1 = new Employee("Osama", "Khan");
        e1.setPassword("123");
        e1.setEmailId("osama.khan");
        e1.setSalary(1000);

        Employee e2 = new Employee("hadi", "Khan");
        e2.setPassword("123");
        e2.setEmailId("hadi.khan");
        e2.setSalary(1000);

        Employee e3 = new Employee("aamir", "Khan");
        e3.setPassword("123");
        e3.setEmailId("aamir.khan");
        e3.setSalary(1000);


        EmployeeRepository repo = new EmployeeRepository();
        repo.create(e1);
        repo.create(e2);
        repo.create(e3);
        // repo.delete(3);

        // getting names of all employees
        Collection<Employee> namesArr = repo.retrieve();
        for (Employee e : namesArr) {
            System.out.println(e.getFirstName() + " " + e.getLastName());
        }

        // Searching Employee by name
        Employee res = repo.find("Hadi");
        System.out.println("Search result: " + res.getFirstName() + " " + res.getLastName());

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