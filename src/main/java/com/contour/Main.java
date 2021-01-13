package com.contour;

import com.contour.hibernate.Employee;
import com.contour.repositorytask.DAL.Repositories.EmployeeRepository;

import javax.persistence.*;
import java.util.*;


public class Main {


    public static void main(String[] args) {
	// write your code here

        // Creating objects
        com.contour.repositorytask.BL.Employee e1 = new com.contour.repositorytask.BL.Employee("Osama", "Khan");
        e1.setPassword("123");
        e1.setEmailId("osama.khan");
        e1.setSalary(1000);

        com.contour.repositorytask.BL.Employee e2 = new com.contour.repositorytask.BL.Employee("hadi", null);
        e2.setPassword("123");
        e2.setEmailId("hadi.khan");
        e2.setSalary(1000);

        com.contour.repositorytask.BL.Employee e3 = new com.contour.repositorytask.BL.Employee("aamir", "Khan");
        e3.setPassword("123");
        e3.setEmailId("aamir.khan");
        e3.setSalary(1000);


        EmployeeRepository repo = new EmployeeRepository();
        repo.create(e1);
        repo.create(e2);
        repo.create(e3);
        // repo.delete(3);

        // getting names of all employees
        Collection<com.contour.repositorytask.BL.Employee> namesArr = repo.retrieve();
        for (com.contour.repositorytask.BL.Employee e : namesArr) {
            System.out.println(e.getFirstName() + " " + e.getLastName());
        }

        // Searching Employee by name
        try {
            com.contour.repositorytask.BL.Employee res = repo.find("Hadi");
            System.out.println("Search result: " + res.getFirstName() + " " + res.getLastName());
        } catch (Exception ex) {
            System.out.println("An exception occurred: " + ex.getMessage());
        }

    }

}


















