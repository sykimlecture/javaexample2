package java0530.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExceptionEx {
    public Class loadClass(String fileName, String className) throws
            FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        ThrowsExceptionEx test = new ThrowsExceptionEx();
        test.loadClass("a.txt", "java.lang.String");
    }
}
