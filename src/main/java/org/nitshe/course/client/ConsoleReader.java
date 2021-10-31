package org.nitshe.course.client;

import org.nitshe.course.core.model.*;

import java.util.Scanner;

public class ConsoleReader {

    public Person readInputParameters(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = in.next();

        System.out.println("Enter your last name");
        String lastName = in.next();

        System.out.println("Enter your mother maiden name");
        String motherMaidenName = in.next();

        System.out.println("What is your martial status? (SINGLE, MARRIED, DIVORCED, WIDOWED, SEPARATED");
        MartialStatus martialStatus = MartialStatus.valueOf(in.next());

        System.out.println("What is your education level? (NONE, PRIMARY, MIDDLE, SECONDARY, POST_SECONDARY, TERTIARY)");
        Education education = Education.valueOf(in.next());

        System.out.println("Enter your email adress: ");
        String email = in.next();

        System.out.println("Enter your phone number: ");
        String phoneNumber = in.next();

        System.out.println("Enter total monthly income PLN");
        double totalMonthlyIncomeInPln = in.nextDouble();

        System.out.println("Enter number of family dependants (including applicant):");
        int numOfDependants = in.nextInt();

        System.out.println("What is purpose of loan? (MORTGAGE | PERSONAL_LOAN):");
        PurposeOfLoanType purposeOfLoanType = PurposeOfLoanType.valueOf(in.next());

        System.out.println("Enter loan amount: ");
        double purpouseOfLoanAmount = in.nextDouble();

        PersonalData personalData = new PersonalData(name, lastName, motherMaidenName, totalMonthlyIncomeInPln,martialStatus, education, numOfDependants);
        ContactData contactData = new ContactData(email, phoneNumber);
        PurposeOfLoan purposeOfLoan = new PurposeOfLoan(purposeOfLoanType, purpouseOfLoanAmount);

        return new Person(personalData, contactData);
    }
}
