package com.bootcamphw.hw02;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "John", 0);
        Product product = new Product(1, "Apple", 10);
        customer.addInventory(product);
        System.out.println(customer.getTotalDebit());
    }
}
