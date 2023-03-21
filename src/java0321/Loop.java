package java0321;

public class Loop {
    public static void dowhileEx() {
        int num = 1;
        int sum = 0;

        do {
            sum += num;
            num++;
        } while (num <= 10);

        System.out.println("1부터 10까지의 합은 " + sum + "입니다");
    }

    public static void forEx() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다");

        // 구구단
        for (int dan = 2; dan <= 9; dan++) {
            for (int times = 1; times <= 9; times++) {
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다");

        dowhileEx();
        forEx();
    }
}
