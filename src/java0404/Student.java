package java0404;

public class Student {

    int studentId;
    String studentName;
    String grade;

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String name) {
        studentName = name;
    }
    public static void main(String[] args) {
        Student student = new Student();  // 디폴트 생성자
        student.studentName = "홍길동";

        System.out.println(student.studentName);
        System.out.println(student.getStudentName());
    }
}
