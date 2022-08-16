import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Kurs kurs = new Kurs("Java", "Muhammed", "01.07.2022",
                "9 ai", "Grajdanskaya 119");
        Student student = new Student("Asan", 19, "male", 21,
                "A1", "OFFLAIN");
        Student student1 = new Student("Anna", 20, "female",
                45, "A2", "OFFLAIN");

        kurs.addStudent(student);
        kurs.addStudent(student1);

        System.out.println("----------------");
        System.out.println("Kurs name:" + kurs.getName());
    }
}