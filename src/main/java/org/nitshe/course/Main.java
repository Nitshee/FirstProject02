package org.nitshe.course;

import org.nitshe.course.client.ConsoleReader;
import org.nitshe.course.core.CreditApplicationService;
import org.nitshe.course.core.model.Person;

public class Main {
    public static void main (String[] args){

        CreditApplicationService service = new CreditApplicationService();

        Person person = new ConsoleReader().readInputParameters();

        String decision = service.getDecision(person);


        System.out.println(decision);
    }
}
