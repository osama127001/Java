package com.contour.organization;

import java.util.Arrays;

public class Team {

    private Employee[] team;
    private Dept department;
    private String currentProject;

    public Team(Dept department, Employee[] team) {
        this.team = team;
        this.department = department;
    }

    public void log() {
        String status = "The team is working on ";
        String lengthOfEmployees = " with total ";
        String empAre = "employees. Employees are ";
        System.out.println( status + currentProject + lengthOfEmployees + team.length + empAre +
                Arrays.toString(team));
    }
}
