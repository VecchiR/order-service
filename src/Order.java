public class Order {
    private Product[] products;
    private Customer customer;
    private Delivery delivery;

    public Order(Customer customer, Product[] products, Delivery delivery){
        this.customer = customer;
        this.products = products;
        this.delivery = delivery;
    }

    public void placeOrder() {
        System.out.println(customer.toString());
        System.out.println(delivery.toString());
        for (Product product : products) {
            System.out.println(product.toString());
        }


    }


}
