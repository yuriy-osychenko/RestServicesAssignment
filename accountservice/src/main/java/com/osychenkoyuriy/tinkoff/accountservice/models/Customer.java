package com.osychenkoyuriy.tinkoff.accountservice.models;
import javax.persistence.*;

public class Customer {

    private long id;

    private String lastName;

    private String firstName;

    public Customer(){}

    public Customer(int id){
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}