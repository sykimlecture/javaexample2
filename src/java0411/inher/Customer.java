package java0411.inher;

public class Customer {
    private int customerId;
    private String customerName;
    protected String customerGrade;
    private int bonusPoint;
    double bonusRatio;

    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다";
    }
}
