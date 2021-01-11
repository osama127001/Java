package com.contour;

import com.contour.repositorytask.DAL.Repositories.EmployeeRepository;
import com.contour.repositorytask.BL.Employee;

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


