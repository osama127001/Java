package com.contour.hibernate;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "employee")
@Table(name = "employee")
public class Employee implements Serializable {

    // Properties

    @Id
    @Column(name = "employeeId", unique = true)
    private int employeeId;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;


    // Getters and Setters
    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }


}
