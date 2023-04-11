package java0404.staticsample;

public class Calc {
    public static int abs(int a) {
        return a > 0 ? a : -a;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
