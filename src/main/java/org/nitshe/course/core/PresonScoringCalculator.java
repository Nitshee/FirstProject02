package org.nitshe.course.core;

import org.nitshe.course.core.model.Person;

public class PresonScoringCalculator {

    public int calculate(Person person) {
        double incomePerFamilyMember = person.getPersonalData().getTotalMonthlyIncomeInPln() / person.getPersonalData().getNumOfDependants();
        int pointsForIncome = (int) (incomePerFamilyMember / 1000) * 100;

        int pointsForMaritalStatus = person.getPersonalData().getMartialStatus().getScoringPoints();
        int pointsForEducation = person.getPersonalData().getEducation().getScoringPoints();

        return pointsForIncome + pointsForMaritalStatus + pointsForEducation;
    }
}
