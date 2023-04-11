package java0404.staticsample;

public class StudentNumberTest {
    public static void main(String[] args) {
        StudentNumber studentLee = new StudentNumber();
        studentLee.setStudentName("이순신");
        System.out.println(studentLee.serialNum);
        System.out.println(studentLee.getStudentName()+" 학번:"+studentLee.studentId);

        StudentNumber studentHong = new StudentNumber();
        studentHong.setStudentName("홍길동");
        System.out.println(studentHong.serialNum);
        System.out.println(studentHong.getStudentName()+" 학번:"+studentHong.studentId);
    }
}
