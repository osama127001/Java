package com.contour.organization;

public class Employee extends Person {

    private String designation;
    private int salary;
    private Dept department;

    public Employee(String designation, int salary, Dept department) {
        this.designation = designation;
        this.salary = salary;
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Dept getDepartment() {
        return department;
    }

    public void setDepartment(Dept department) {
        this.department = department;
    }
}
