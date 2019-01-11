package com.example.demo.domain;

import lombok.Data;

@Data
public class Customer {

    private int custNumber;
    private String firstName;
    private String lastName;

    public Customer() {

    }

    public Customer(int custNumber, String firstName, String lastName) {
        this.custNumber = custNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
