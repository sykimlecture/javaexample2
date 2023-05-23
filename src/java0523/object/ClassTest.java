package java0523.object;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Person person = new Person();
        Class pClass = person.getClass();
        System.out.println(pClass.getName());

        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("java0523.object.Person");
        System.out.println(pClass3.getName());
        Person person2 = (Person) pClass3.newInstance();
        System.out.println(person2);
        System.out.println(person);
    }
}
