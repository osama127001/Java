package com.contour.organization;

public class Department {

    public String name;
    protected Team[] teams;
    protected int deptId;

    public void operations() {
        String operationsLog = "Department operating starts at XX:YY";
        System.out.println(operationsLog);
    }

}
