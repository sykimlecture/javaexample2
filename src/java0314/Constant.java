package java0314;

public class Constant {
    public static void main(String[] args) {
        final int MAX_STUDENT_NUM = 30;
        final int MAX_NUM = 100;
        final int MIN_NUM;

        int count = 30;

        MIN_NUM = 0;
        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);
        System.out.println(count);

        if (count == MAX_STUDENT_NUM) {
            System.out.println("TRUE");
        }

        String str = "s30";
        String str2 = "s30";
        if (str == str2) {
            System.out.println("TRUE");
        }
    }
}
