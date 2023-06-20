package java0620;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamTest3 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("./data/input2.txt")) {
           byte[] bs =new byte[10];
           int i;
           while((i = fis.read(bs)) != -1) {
               for (byte b : bs) {
                   System.out.println((char)b);
               }
               System.out.println(": " + i + "바이트 읽음");
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
