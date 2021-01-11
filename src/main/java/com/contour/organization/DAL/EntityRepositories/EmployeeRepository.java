package com.contour.organization.DAL.EntityRepositories;

import com.contour.organization.DAL.Repository;
import com.contour.repositorytask.BL.Employee;

import java.util.Collection;

public class EmployeeRepository extends Repository<Employee> {

    @Override
    public Employee find(String value) {
        String keyWord = value.toLowerCase();
        Collection<Employee> list = super.retrieve();
        for (Employee emp : list) {
            if (emp.getFirstName().toLowerCase().equals(keyWord) || emp.getLastName().toLowerCase().equals(keyWord)) {
                return emp;
            }
        }
        return null;
    }

}
