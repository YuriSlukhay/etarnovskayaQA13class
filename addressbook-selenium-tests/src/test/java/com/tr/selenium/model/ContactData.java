package com.tr.selenium.model;

import java.io.File;

public class ContactData {
    String firstName;
    String lastName;
    String address;
    String group;
    File photo;

    public File getPhoto() {
        return photo;
    }

    public ContactData setPhoto(File photo) {
        this.photo = photo;
        return this;
    }

    public String getGroup() {
        return group;
    }

    public ContactData setGroup(String group) {
        this.group = group;
        return this;
    }



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
