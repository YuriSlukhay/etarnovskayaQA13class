package com.tr.selenium.model;

public class ContactData {
    String firstName;
    String lastName;
    String address;

    public String getFirstName() {
        return firstName;
    }

    public ContactData setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public ContactData setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public ContactData setAddress(String address) {
        this.address = address;
        return  this;
    }
}
