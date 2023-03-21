package java0321;

public class ContinueBreak {
    public static void main(String[] args) {
        int total = 0;
        int sum = 0;
        
        for (int num = 1; num <= 100; num++) {
            if (num % 2 == 0) {
                continue;
            }
            total += num;
        }
        System.out.println("1부터 100까지 홀수의 합은 " + total + "입니다");

        int num;
        for (num = 0;; num++) {
            sum += num;
            if (sum >= 100) {
                break;
            }
        }
        System.out.println("num : " + num);
        System.out.println("sum : " + sum);
    }
}
