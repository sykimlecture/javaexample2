package java0404.staticsample;

public class SutdentHideTest {
    public static void main(String[] args) {
        StudentHide studentHide = new StudentHide();

        studentHide.setStudentId(1111111);
        studentHide.setStudentName("홍길동");
        studentHide.setSutdentDepart("인공지능");
        studentHide.setStudentAddress("서울시 강남구 서초구");

        studentHide.getStudentAddress();

        System.out.println(studentHide.toString());

        StudentHide studentHide2 = new StudentHide();
        studentHide2.setStudentName("이순신");

        System.out.println(studentHide2.toString());
    }
}
