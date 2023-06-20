package java0620;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamTest4 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("./data/reader.txt")) {
            int i;
            while((i = fis.read()) != -1) {
                System.out.println((char)i);
            }
            System.out.println("end");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
