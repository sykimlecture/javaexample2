package java0404.staticsample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    public static String getCurrentDate() {
        String localDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        return localDate;
    }
}
