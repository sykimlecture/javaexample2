package java0509;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buy = customer;
        buy.buy();
        buy.order();

        Sell sell = customer;
        sell.sell();
        sell.order();

        if (sell instanceof Customer) {
            Customer customer1 = (Customer) sell;
            customer1.buy();
            customer1.sell();
        }

        customer.order();
    }
}
