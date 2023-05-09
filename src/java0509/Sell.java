package java0509;

public interface Sell {
    void sell();
    
    default void order() {
        System.out.println("만매 주문");
    }
}
