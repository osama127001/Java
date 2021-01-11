package com.contour.organization.BL;

public abstract class Department {

    protected String name;
    protected Team[] teams;
    protected int deptId;

    public void operations() {
        String operationsLog = "Department operating starts at XX:YY";
        System.out.println(operationsLog);
    }

}
