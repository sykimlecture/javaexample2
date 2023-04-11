package java0404.staticsample;

public class StudentNumber {
    public static int serialNum = 1000;
    public int studentId;
    private String studentName;
    private int grade;
    private String address;

    public StudentNumber() {
        serialNum++;
        studentId = serialNum;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }
}
