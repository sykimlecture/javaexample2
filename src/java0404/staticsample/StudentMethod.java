package java0404.staticsample;

public class StudentMethod {
    private static int serialNum = 1000;
    public int studentId;
    private String studentName;
    private int grade;
    private String address;

    public StudentMethod() {
        serialNum++;
        studentId = serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static int getSerialNum() {
        int i = 10;
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        StudentMethod.serialNum = serialNum;
    }
}
