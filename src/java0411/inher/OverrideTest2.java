package java0411.inher;

public class OverrideTest2 {
    public static void main(String[] args) {
        Customer vc = new CustomerVip(10010, "나몰라", 2000);
        vc.bonusPoint = 1000;

        // 선언한 클래스형이 아닌 생성된 인스턴스의 메서드 호출
        // 인스턴스 메서드가 호출되는 기술 : 가상 메서드(virtual method)
        System.out.println(vc.getCustomerName() + "님이 지불해야 하는 금액은 " + vc.calPrice(10000)+ "원 입니다");
    }
}
