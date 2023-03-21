package java0314;

public class IfExample {
    public static void onlyif(int age) {
        int charge;
        if (age < 8) {
            charge = 1000;
            System.out.println("취학전 아동입니다");
        }

        if (age < 14) {
            charge = 2000;
            System.out.println("초등학생입니다");
        }

        if (age < 20) {
            charge = 3000;
            System.out.println("중등학생입니다");
        } else {
            charge = 4000;
        }

        System.out.println("입장료는 " + charge + "원 입니다");
    }
    public static void main(String[] args) {
        int age = 9;
        int charge;
        
        if (age < 8) {
            charge = 1000;
            System.out.println("취학전 아동입니다");
        } else if (age < 14) {
            charge = 2000;
            System.out.println("초등학생입니다");
        } else if (age < 20) {
            charge = 3000;
            System.out.println("중등학생입니다");
        } else {
            charge = 4000;
        }

        System.out.println("입장료는 " + charge + "원 입니다");

        onlyif(age);
    }
}
