package java0404.staticsample;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("이순신");
        System.out.println(studentLee.serialNum);

        studentLee.serialNum++;

        Student studentHong = new Student();
        studentHong.setStudentName("홍길동");
        System.out.println(studentHong.serialNum);
        System.out.println(studentLee.serialNum);
    }
}
