package java0620;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\javaimsi\\zoom\\newFile.txt");
        File file2 = new File("D:\\javaimsi\\zoom\\aaa");
        File file3 = new File("D:\\javaimsi\\zoom2\\log");

        file3.mkdirs();

        file2.mkdir();

        file.createNewFile();


        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        //file.delete();
    }
}
