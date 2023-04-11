package java0404.staticsample;

public class StudentHide {
    private int studentId;
    private String studentName;
    private String sutdentDepart;
    private String studentAddress;
    private String studentTelNo;
    private String sutdentMobile;

    public StudentHide() {
    }

    public StudentHide(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSutdentDepart() {
        return sutdentDepart;
    }

    public void setSutdentDepart(String sutdentDepart) {
        this.sutdentDepart = sutdentDepart;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentTelNo() {
        return studentTelNo;
    }

    public void setStudentTelNo(String studentTelNo) {
        this.studentTelNo = studentTelNo;
    }

    public String getSutdentMobile() {
        return sutdentMobile;
    }

    public void setSutdentMobile(String sutdentMobile) {
        this.sutdentMobile = sutdentMobile;
    }

    @Override
    public String toString() {
        return "StudentHide{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", sutdentDepart='" + sutdentDepart + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentTelNo='" + studentTelNo + '\'' +
                ", sutdentMobile='" + sutdentMobile + '\'' +
                '}';
    }
}
