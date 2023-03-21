package java0404;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentName = "이순신";

        System.out.println(student.getStudentName());

        Student student2 = new Student();
        student2.studentName = "세종대왕";

        System.out.println(student2.getStudentName());

        System.out.println(student);
        System.out.println(student2);
        
        StudentCourse studentCourse = new StudentCourse();
        studentCourse.studentName = "김길동";
        //studentCourse.korean.score = 100;
       // studentCourse.korean.subjectName = "쉬운국어";

        Subject subject = new Subject();
        subject.score = 100;
        subject.subjectName = "쉬운국어";

        System.out.println(subject.subjectName);

        studentCourse.korean = subject;

        System.out.println(studentCourse.korean.subjectName);

        // studentCourse.korean.subjectName = "쉬운국어";
    }
}
