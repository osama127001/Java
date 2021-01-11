package com.contour.repositorytask.BL;

public class Employee extends Person {

    private String emailId;
    private String password;
    private int salary;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
        this.emailId = null;
        this.password = null;
        this.salary = 0;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
