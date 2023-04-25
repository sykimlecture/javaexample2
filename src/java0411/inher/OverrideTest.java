package java0411.inher;

public class OverrideTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;

        CustomerVip customerKim = new CustomerVip(10020, "김유신", 12345);
        customerKim.bonusPoint = 10000;

        int price = 10000;
        System.out.println(customerLee.getCustomerName() + "님이 지불해야 하는 금액은 " + customerLee.calPrice(price)+ "원 입니다");
        System.out.println(customerKim.getCustomerName() + "님이 지불해야 하는 금액은 " + customerKim.calPrice(price)+ "원 입니다");
    }
}
