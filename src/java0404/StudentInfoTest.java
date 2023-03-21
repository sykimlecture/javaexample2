package java0404;

public class StudentInfoTest {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();

        // studentInfo.studentName = "홍길동";

        studentInfo.setStudentName("홍길동");

        System.out.println(studentInfo.getStudentName());
    }
}
