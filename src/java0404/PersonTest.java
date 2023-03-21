package java0404;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person(); //
        person.name = "김유신";
        person.height = 180.0F;
        person.weight = 85.5F;

        Person personKim = new Person("김춘추");

        Person personLee = new Person("이순신", 180, 80.1F);

        System.out.println(person.name);
        System.out.println(personKim.name);
        System.out.println(personLee.name);
    }
}
