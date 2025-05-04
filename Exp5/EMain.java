import Ecommerce.Product;
import Ecommerce.Customer;
import Ecommerce.Order;

public class EMain
 {
    public static void main(String[] args) {

        Product product = new Product(101, "Laptop", 70000);
        Customer customer = new Customer(201, "Gayatri Jadhav", "123 Kololi ,Maharashtra");


        product.displayProduct();
        customer.displayCustomer();

        Order order = new Order(product.getProductId(), customer.getCustomerId(), 2, product.getPrice());
        order.placeOrder();
    }
}