package Ecommerce;

public class Order {
    int productId;
    int customerId;
    int quantity;
    double price;

    public Order(int productId, int customerId, int quantity, double price) {
        this.productId = productId;
        this.customerId = customerId;
        this.quantity = quantity;
        this.price = price;
    }

    public double calculateTotalCost() {
        return price * quantity;
    }

    public void placeOrder() {
        System.out.println("\n*** Order Details ***");
        System.out.println("Product ID  : " + productId);
        System.out.println("Customer ID : " + customerId);
        System.out.println("Quantity    : " + quantity);
        System.out.println("Total Cost  : $" + calculateTotalCost());
    }
}