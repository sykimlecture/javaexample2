package java0620;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("./data/input.txt");
            System.out.println((char)fis.read());
            System.out.println(fis.read());
            System.out.println(fis.read());
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("===================================");
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (NullPointerException | IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("end");
    }
}
