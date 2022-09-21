package com.company.entity;

public class Customer {
    private Integer id;
    private String customerNumber;
    private String phone;

    public Customer() {
    }

    public Customer(Integer id, String customerNumber, String phone) {
        this.id = id;
        this.customerNumber = customerNumber;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
