package java0425;

public class CustomerGold extends Customer {
    double saleRatio;

    public CustomerGold(int customerId, String customerName) {
        super(customerId, customerName);
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

    @Override
    public int calPrice(int price ) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }
}
