package PersonMasiv;

import java.util.Random;

public class Mentor extends Person1 {

    public Student[] students=new Student[10];
    private int indexOfStudents=0;

    public Mentor(String name,int age){
        super(name,age);

    }
    public void takeAnExam(Student student){
        student.explain();

    }
    public Student[] getStudents(){
        return  students;
    }
    public void  addStudents(Student student){
         students[indexOfStudents]= student;
            indexOfStudents++;
        }
    public int getIndexOfStudents(){
        return indexOfStudents;
    }
}
