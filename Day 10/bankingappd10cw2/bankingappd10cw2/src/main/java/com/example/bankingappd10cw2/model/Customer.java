// Customer.java
package com.example.bankingappd10cw2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.easymock.internal.matchers.Find;

@jakarta.persistence.Entity
public class Customer {
    Find
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private String customerName;
    private String city;
    private String address;
    private int pincode;

    // Constructors, getters, and setters
    public Customer() {}

    public Customer(String customerName, String city, String address, int pincode) {
        this.customerName = customerName;
        this.city = city;
        this.address = address;
        this.pincode = pincode;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
