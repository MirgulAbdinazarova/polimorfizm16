public class Kurs {

    private String name;
    private String nameTeacher;
    private String startedAt;
    private Student[] studs = new Student[70];
    private String courseLenght;
    private String adres;
    private int minTypeSpeed=20;
    private int lastStudentIndex = 0;
    private int rejectedStudents = 0;
    public Kurs(String name, String nameTeacher, String startedAt, String courseLenght, String adres) {
        if (nameTeacher.length() < 2) {
            System.out.println("Имя инструктора введено не правильно");
        } else
            this.nameTeacher = nameTeacher;

        this.name = name;

        this.startedAt = startedAt;
        this.courseLenght = courseLenght;
        this.adres = adres;


    }
    public String getName(){
        return name;
    }
    public  String getNameTeacher(){
        return nameTeacher;
    }
    public String getStartedAt(){
        return startedAt;
    }
    public String getCourseLenght(){
        return courseLenght;
    }
    public String getAdres(){
        return adres;
    }
    public int getMinTypeSpeed(){
        return minTypeSpeed;
    }
    public Student [] getStuds(){
        return studs;
    }
    public int getLastStudentIndex(){
        return lastStudentIndex;
    }
    public int getRejectedStudents(){
        return rejectedStudents;
    }
    public void addStudent(Student student){
      if(student.getTypingSpeed()>minTypeSpeed){
          studs[lastStudentIndex]=student;
          lastStudentIndex++;
      }else
          rejectedStudents++;

    }

}
