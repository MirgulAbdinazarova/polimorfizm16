package PersonMasiv;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Mentor mentor1 = new Mentor("Muhammed", 23);
        Mentor mentor2 = new Mentor("Zhanarbek", 20);
        Mentor mentor3 = new Mentor("Muhammed2", 26);
        Mentor mentor4 = new Mentor("Nurbek", 20);
        Mentor[] mentors = {mentor1, mentor2, mentor3, mentor4};


        Student student1 = new Student("Bermet", 19);
        Student student2 = new Student("Rasul", 45);
        Student student3 = new Student("Aisalbek", 20);
        Student student4 = new Student("Baktygul", 21);
        Student student5 = new Student("Bakai", 31);
        Student student6 = new Student("Almaz", 16);
        Student student7 = new Student("Daniyar", 18);
        Student student8 = new Student("Baky", 22);
        Student student9 = new Student("Ailin", 19);
        Student student10 = new Student("Azaliya", 19);
        Student student11 = new Student("Azamat", 25);
        Student student12 = new Student("Daniyar", 17);
        Student student13 = new Student("Munara", 38);
        Student student14 = new Student("Samara", 39);
        Student student15 = new Student("Ali", 16);
        Student student16 = new Student("Bakyt", 23);
        Student student17 = new Student("Aizada", 25);
        Student student18 = new Student("Emir", 24);
        Student student19 = new Student("Syimyk", 16);
        Student student20 = new Student("Sasha", 30);
        Student student21 = new Student("Aiya", 19);
        Student student22 = new Student("Raxat", 45);
        Student student23 = new Student("Ainura", 20);
        Student student24 = new Student("Zina", 21);
        Student student25 = new Student("Nazar", 31);
        Student student26 = new Student("Altyn", 16);
        Student student27 = new Student("Dastan", 18);
        Student student28 = new Student("Beka", 22);
        Student student29 = new Student("Ramzan", 19);
        Student student30 = new Student("Talas", 19);
        Student student31 = new Student("Oomat", 25);
        Student student32 = new Student("Jyldyz", 17);
       Student student33 = new Student("Amir", 38);
        Student student34 = new Student("Aman", 39);
        Student student35 = new Student("Meerim", 16);
        Student student36 = new Student("Asel", 23);
        Student student37 = new Student("Chyngyz", 25);
        Student student38 = new Student("Elmira", 24);
        Student student39 = new Student("Syrga", 16);
        Student student40 = new Student("Sardar", 30);

        Student[] students = new Student[40];

        Random random = new Random();
        for (int i = 0; i < students.length; i++) {
            Student[]namesArr={student1,student2,student3,student4,student5,student6,student7,
            student8,student9,student10,student11,student12,student13,student14,student15,student16,
            student17,student18,student19,student20,student21,student22,student23,student24,
            student25,student26,student27,student28,student29,student30,student31,student32,
                    student33,student34,student35,student36,student37,student38,student39,
            student40};
            students[i]=namesArr[i];
        }
        for (int i = 0, sch = 0; i < students.length; i++) {
            if (i == 10) {
                i = 0;

            }
            int num = random.nextInt(4);
            if (mentors[num].students[i] == null) {
                mentors[num].addStudents(students[sch]);
                sch++;

            }
            if (sch == 40) {
                break;

            }
        }
        for (Mentor mentor:mentors){
            System.out.println("-----"+"Mentor:"+mentor.getName()+"----");
            for (int i = 0; i < mentor.students.length; i++) {
                System.out.println("- "+mentor.students[i].getName());
            }

        }


    }

}

