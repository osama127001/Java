package com.contour.organization;

public class Guest extends Person {

    private String purposeOfVisit;

    public Guest(String purposeOfVisit) {
        this.purposeOfVisit = purposeOfVisit;
    }

    public String getPurposeOfVisit() {
        return purposeOfVisit;
    }

    public void setPurposeOfVisit(String purposeOfVisit) {
        this.purposeOfVisit = purposeOfVisit;
    }

}
