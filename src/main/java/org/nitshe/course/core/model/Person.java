package org.nitshe.course.core.model;

public class Person {
    private PersonalData personalData;

    public PersonalData getPersonalData() {
        return personalData;
    }

    public ContactData getContactData() {
        return contactData;
    }

    public Person(PersonalData personalData, ContactData contactData) {
        this.personalData = personalData;
        this.contactData = contactData;
    }

    private  final ContactData contactData;
}
