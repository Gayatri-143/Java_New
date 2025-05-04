package Ecommerce;

public class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

   
    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public void displayProduct() {
        System.out.println("\n*** Product Details ***");
        System.out.println("Product ID : " + productId);
        System.out.println("Name       : " + name);
        System.out.println("Price      : $" + price);
    }
}