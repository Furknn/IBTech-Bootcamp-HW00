package com.bootcamphw.hw02;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long customerId;
    private String customerName;
    private double totalDebit;
    private List<Product> inventory;

    public Customer(long customerId, String customerName, double totalDebit) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.totalDebit = totalDebit;
        inventory = new ArrayList<Product>();
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalDebit() {
        return totalDebit;
    }

    public void setTotalDebit(double totalDebit) {
        this.totalDebit = totalDebit;
    }

    public List<Product> getInventory() {
        return inventory;
    }

    public void addInventory(Product product) {
        inventory.add(product);
        this.totalDebit += product.getSalesPrice();
    }

}
