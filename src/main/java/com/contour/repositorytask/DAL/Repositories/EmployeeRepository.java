package com.contour.repositorytask.DAL.Repositories;

import com.contour.repositorytask.BL.Employee;
import com.contour.repositorytask.DAL.Exceptions.NullFieldException;

import java.util.Collection;

public class EmployeeRepository extends Repository<Employee> {

    @Override
    public Employee find(String value) throws NullFieldException {
        String keyWord = value.toLowerCase();
        Collection<Employee> list = super.retrieve();
        for (Employee emp : list) {
            if (emp.getFirstName() == null || emp.getLastName() == null) {
                throw new NullFieldException("FirstName or LastName cannot be null");
            } else if (emp.getFirstName().toLowerCase().equals(keyWord) || emp.getLastName().toLowerCase().equals(keyWord)) {
                return emp;
            }
        }
        return null;
    }
}
