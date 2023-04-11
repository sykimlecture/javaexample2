package java0404.cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student student = new Student();
        Student studentJames = new Student("James", 5000);
        Student studentTomas = new Student("Tomas", 5000);

        Bus bus = new Bus(100);
        Subway subway = new Subway("2호선");

        studentJames.takeBus(bus);
        studentJames.showInfo();
        bus.showInfo();

        studentJames.takeSubway(subway);
        studentJames.showInfo();
        subway.showInfo();

       // Subway subway = new Subway("2호선");
        studentTomas.takeSubway(subway);
        studentTomas.showInfo();
        subway.showInfo();

    }
}
