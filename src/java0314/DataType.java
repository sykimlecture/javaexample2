package java0314;

/*
 * 데이타 타입 연습
 */
public class DataType {
    public static void main(String[] args) {
        int num = 15; // 10 진수
        int num2 = 015; // 8 진수
        int num3 = 0x15;    // 16진수(21)
        int num4 = 0b0101;  // 2진수(5)

        long longNum = 24L;
        long longNum2 = 24l;

        double doubleNum = 0.1245;
        double doubleNum2 = 1234E-4; // 1234*10^-4 = 0.1234

        float floatNum = 0.123f;
        double doubleNum3 = .1234D; // 0.1234와 동일

        char a = 'W';
        char b = '글';

        // boolean
        boolean isBoolean = true;
        boolean isTrue = 10 > 0;

        System.out.println(isTrue);

        String str = null;

    }
}
