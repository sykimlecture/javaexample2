package java0404;

class BirthDay {
    int day;
    int month;
    private int year;
    public  void setYear(int year) {
        this.year = year;
    }
    public void printThis() {
        System.out.println(this);
    }
}

class School {

}

public class ThisExam {
    public static void main(String[] args) {
        BirthDay birthDay = new BirthDay();
        birthDay.setYear(2000);

        System.out.println(birthDay);

        birthDay.printThis();
    }
}
