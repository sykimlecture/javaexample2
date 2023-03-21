package java0314;

public class Operation {
    public static void operation1() {
        int mathScore = 90;
        int engScore = 70;
        int totalScore = mathScore + engScore;
        System.out.println(totalScore);
        double avgScore = totalScore / 2.0;
        System.out.println(avgScore);
    }

    public static void operation2() {
        int gameScore = 150;
        int lastScore1 = gameScore++;
        System.out.println(gameScore);
        System.out.println(lastScore1);
        int lastScore2 = gameScore--;
        System.out.println(lastScore2);
    }
    public static void main(String[] args) {
        operation1();
        operation2();

        //
        int num = 10;
        int i = 2;

        boolean value = ((num = num + 10) < 10) && ((i = i + 2) < 10);
        System.out.println(value);

        value = ((num = num + 10) > 10) || ((i = i + 2) < 10);
        System.out.println(value);
    }
}
