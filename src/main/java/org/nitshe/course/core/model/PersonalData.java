package org.nitshe.course.core.model;

public class PersonalData {
    private final String name;
    private final String lastName;
    private final String motherMaidenName;
    private final double totalMonthlyIncomeInPln;
    private final MartialStatus martialStatus;
    private final Education education;
    private final int numOfDependants;

    public PersonalData(String name, String lastName, String motherMaidenName, double totalMonthlyIncomeInPln, MartialStatus martialStatus, Education education, int numOfDependants) {
        this.name = name;
        this.lastName = lastName;
        this.motherMaidenName = motherMaidenName;
        this.totalMonthlyIncomeInPln = totalMonthlyIncomeInPln;
        this.martialStatus = martialStatus;
        this.education = education;
        this.numOfDependants = numOfDependants;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMotherMaidenName() {
        return motherMaidenName;
    }

    public double getTotalMonthlyIncomeInPln() {
        return totalMonthlyIncomeInPln;
    }

    public MartialStatus getMartialStatus() {
        return martialStatus;
    }

    public Education getEducation() {
        return education;
    }

    public int getNumOfDependants() {
        return numOfDependants;
    }
}

