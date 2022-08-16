package tema16ex3;

import java.util.Random;

public class Student  extends Person{
    private String schoolName;
    private int grade;
    private int examMark;

    public Student(String name,int age,String schoolName,int grade){
        super(name, age);
        Random random=new Random();
        this.schoolName=schoolName;
        this.grade=grade;
        this.examMark=random.nextInt(10,100);
    }
    @Override
    public void IAmAble(){
        System.out.println("I am student and i can get marks");
    }
    public String getSchoolName() {
        return schoolName;
    }

    public int getGrade() {
        return grade;
    }
    public int getExamMark(){
        return examMark;
    }
}
