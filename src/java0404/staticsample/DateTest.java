package java0404.staticsample;

public class DateTest {
    public static void main(String[] args) {
        String currentDate = DateUtil.getCurrentDate();
        System.out.println(currentDate);

        String currentDate2 = DateUtil.getCurrentDate("yyyyMMdd");
        System.out.println(currentDate2);

        String currentMonth = DateUtil.getCurrentMonth();
        System.out.println(currentMonth);
    }
}
