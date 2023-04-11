package java0404.staticsample;

public class StudentMethodTest {
    public static void main(String[] args) {
        StudentMethod studentLee = new StudentMethod();
        studentLee.setStudentName("이순신");
        System.out.println(StudentMethod.getSerialNum());
        System.out.println(studentLee.getStudentName() + " 학번:"+studentLee.studentId);

        StudentMethod studentHong = new StudentMethod();
        studentHong.setStudentName("홍길동");
        System.out.println(StudentMethod.getSerialNum());
        System.out.println(studentHong.getStudentName() + " 학번:"+studentHong.studentId);
    }
}
