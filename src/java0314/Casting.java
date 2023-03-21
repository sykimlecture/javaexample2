package java0314;

public class Casting {
    public static void implicit() {
        byte bNum = 10;
        int iNum = bNum;
        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum;
        System.out.println(iNum);
        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum;
        System.out.println(dNum);
    }

    public static void explicit() {
        double dNum = 1.2;
        float fNum = 0.9F;

        int iNum = (int) (dNum + fNum);
        int iNum2 = (int) dNum + (int) fNum;

        System.out.println(iNum);
        System.out.println(iNum2);
    }

    public static void main(String[] args) {
        implicit();
        System.out.println("--------------------------------------");
        explicit();
    }
}
