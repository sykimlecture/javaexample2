package java0411.inher;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.eat();

        Lion lion = new Lion();
        lion.sleep();
    }
}
