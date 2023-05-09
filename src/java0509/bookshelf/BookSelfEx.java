package java0509.bookshelf;

public class BookSelfEx {
    public static void main(String[] args) {
        Queue shelfQueue = new BookSelf();
        shelfQueue.enQueue("택백산맥 1");
        shelfQueue.enQueue("택백산맥 2");
        shelfQueue.enQueue("택백산맥 3");

        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
    }
}
