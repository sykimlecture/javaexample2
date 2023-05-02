package java0502.abstraceEx;

public abstract class Computer {
    public abstract void display();
    public abstract void typing();

    public void turnOn() {
        System.out.println("Power On");
    }

    public void turnOff() {
        System.out.println("Power Off");
    }
}
