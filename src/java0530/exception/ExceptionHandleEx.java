package java0530.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandleEx {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("여기서도 수행됩니다");
    }
}
