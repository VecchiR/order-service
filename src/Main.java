public class Main {
    public static void main(String[] args){

        Product testProduct1 = new Product("Nice product 1", 1.2);

        Product testProduct2 = new Product("Nice product 2", 12.21);

        Customer testCustomer = new Customer("Bob", "123456789", "bob@bob.com");

        Delivery testDelivery = new Delivery("pickup");

        Product[] productList = {testProduct1, testProduct2};

        Order testOrder = new Order(testCustomer, productList, testDelivery);

        testOrder.placeOrder();

    }
}
