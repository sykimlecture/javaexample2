package java0404.cooperation;

public class Subway {
    String lineNumber;
    int money;
    int passengerCount;

    public Subway(String lineNumber) {
        this.lineNumber = lineNumber;
    }
    public void take(int money) {
        // passengerCount++;
        this.money = money * ++passengerCount;
    }

    public void showInfo() {
        System.out.println("지하철 " + lineNumber + "번의 승객은 "
                + passengerCount + "명이고, 수입은 " + money + "입니다");
    }
}
