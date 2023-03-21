package java0321;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        // myDate.day = 31;
        myDate.setDay(32);
        int day = myDate.getDay();
        System.out.println(day);
    }

}
