package com.contour;

import com.contour.hibernate.Employee;
import com.contour.repositorytask.DAL.Repositories.EmployeeRepository;

import javax.persistence.*;
import java.util.*;


public class Main {

    // Creating Entity Manager
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("JavaTraining");

    // CRUD Operations
    public static void addEmployee(int id, String firstName, String lastName) {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction et = null;
        try {
            et = em.getTransaction();
            et.begin();
            Employee emp = new Employee();
            emp.setEmployeeId(id);
            emp.setFirstName(firstName);
            emp.setLastName(lastName);
            em.persist(emp);
            et.commit();
        } catch (Exception ex) {
            if (et != null) {
                et.rollback();
            }
            ex.printStackTrace();
        } finally {
            em.close();
        }
    }

    public static void getEmployee(int id) {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        String query = "SELECT e FROM employee e WHERE e.employeeId = :empId";
        TypedQuery<Employee> tq = em.createQuery(query, Employee.class);
        tq.setParameter("empId", id);
        Employee emp = null;
        try {
            emp = tq.getSingleResult();
            System.out.println(emp.getFirstName() + " " + emp.getLastName());
        } catch (NoResultException exception) {
            exception.printStackTrace();
        } finally {
            em.close();
        }
    }

    public static void getEmployees() {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        String query = "SELECT e FROM employee e WHERE e.employeeId IS NOT NULL";
        TypedQuery<Employee> tq = em.createQuery(query, Employee.class);
        List<Employee> emps;
        try {
            emps = tq.getResultList();
            for (Employee e : emps) {
                System.out.println(e.getFirstName() + " " + e.getLastName());
            }
        } catch (NoResultException exception) {
            exception.printStackTrace();
        } finally {
            em.close();
        }
    }

    public static void updateFirstNameOfEmployee(int id, String firstName) {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction et = null;
        Employee emp = null;
        try {
            et = em.getTransaction();
            et.begin();
            emp = em.find(Employee.class, id);
            emp.setFirstName(firstName);
            em.persist(emp);
            et.commit();
        } catch (Exception ex) {
            if (et != null) {
                et.rollback();
            }
            ex.printStackTrace();
        } finally {
            em.close();
        }
    }

    public static void deleteEmployee(int id) {
        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction et = null;
        Employee emp = null;
        try {
            et = em.getTransaction();
            et.begin();
            emp = em.find(Employee.class, id);
            em.remove(emp);
            et.commit();
        } catch (Exception ex) {
            if (et != null) {
                et.rollback();
            }
            ex.printStackTrace();
        } finally {
            em.close();
        }
    }



    public static void main(String[] args) {
	// write your code here

        // Testing Hibernate

         // Adding data
         addEmployee(1, "Osama", "Khan");
         addEmployee(2, "Aamir", "Hanif");
         addEmployee(3, "Hadi", "Rehman");

        // Getting single employee by Id
        getEmployee(1);
        getEmployee(2);
        getEmployee(3);

        // Getting all employees
        getEmployees();

        // Updating
         updateFirstNameOfEmployee(3, "Tariq");

        // Deletion
        deleteEmployee(3);

        ENTITY_MANAGER_FACTORY.close();
    }

}

















//    // Creating objects
//    Employee e1 = new Employee("Osama", "Khan");
//        e1.setPassword("123");
//                e1.setEmailId("osama.khan");
//                e1.setSalary(1000);
//
//                Employee e2 = new Employee("hadi", "Khan");
//                e2.setPassword("123");
//                e2.setEmailId("hadi.khan");
//                e2.setSalary(1000);
//
//                Employee e3 = new Employee("aamir", "Khan");
//                e3.setPassword("123");
//                e3.setEmailId("aamir.khan");
//                e3.setSalary(1000);
//
//
//                EmployeeRepository repo = new EmployeeRepository();
//                repo.create(e1);
//                repo.create(e2);
//                repo.create(e3);
//                // repo.delete(3);
//
//                // getting names of all employees
//                Collection<Employee> namesArr = repo.retrieve();
//        for (Employee e : namesArr) {
//        System.out.println(e.getFirstName() + " " + e.getLastName());
//        }
//
//        // Searching Employee by name
//        Employee res = repo.find("Hadi");
//        System.out.println("Search result: " + res.getFirstName() + " " + res.getLastName());