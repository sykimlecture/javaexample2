package java0523.object;

import java.util.ArrayList;

class MyBook implements Cloneable {
    String title;
    public MyBook(String title) {
        this.title = title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return title;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ObjectArrayClone {
    public static void main(String[] args) {
        ArrayList<MyBook> bookList = new ArrayList<>();

        MyBook book1 = new MyBook("Java1");
        MyBook book2 = new MyBook("Java2");
        MyBook book3 = new MyBook("Java3");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        ArrayList<MyBook> copyList = (ArrayList<MyBook>) bookList.clone();
        copyList.add(new MyBook("자료구조"));
        System.out.println(bookList);
        System.out.println(copyList);

        book3.setTitle("데이터통신");
        System.out.println(bookList);
        System.out.println(copyList);
    }
}
