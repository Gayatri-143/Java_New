package Ecommerce;

public class Customer {
    private int customerId;
    private String name;
    private String address;

    public Customer(int customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }

  
    public int getCustomerId() {
        return customerId;
    }

    public void displayCustomer() {
        System.out.println("\n*** Customer Details ***");
        System.out.println("Customer ID : " + customerId);
        System.out.println("Name        : " + name);
        System.out.println("Address     : " + address);
    }
}