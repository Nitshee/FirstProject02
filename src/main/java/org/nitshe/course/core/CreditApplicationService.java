package org.nitshe.course.core;

import org.nitshe.course.core.model.Person;

public class CreditApplicationService {

    public String getDecision(Person person){
        PresonScoringCalculator calculator = new PresonScoringCalculator();
        String decision;
        int scoring = calculator.calculate(person);
        if(scoring < 300){
            decision = "Sorry " + person.getPersonalData().getName() + " " + person.getPersonalData().getLastName() + "decision is negative.";
        }else if(scoring <= 400){
            decision = "Sorry " + person.getPersonalData().getName() + " " + person.getPersonalData().getLastName() + ", bank requires additional documents.Our Consultant will contact you.";
        }else {
            decision = "Congratulation, " + person.getPersonalData().getName() + " " + person.getPersonalData().getLastName() + ", decision is positive";
        }
        return decision;
    }
}
