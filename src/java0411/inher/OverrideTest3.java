package java0411.inher;

public class OverrideTest3 {
    public static void main(String[] args) {
        int price = 10000;
        Customer customerLee = new Customer(10010, "이순신");
        System.out.println(customerLee.getCustomerName() + "님이 지불해야 하는 금액은 " + customerLee.calPrice(price)+ "원 입니다");

        CustomerVip customerKim = new CustomerVip(10020, "김유신", 12345);
        System.out.println(customerKim.getCustomerName() + "님이 지불해야 하는 금액은 " + customerKim.calPrice(price)+ "원 입니다");

        Customer vc = new CustomerVip(10010, "나몰라", 2000);
        System.out.println(vc.getCustomerName() + "님이 지불해야 하는 금액은 " + vc.calPrice(price)+ "원 입니다");
    }
}
