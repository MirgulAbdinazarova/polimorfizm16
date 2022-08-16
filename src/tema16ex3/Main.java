package tema16ex3;

public class Main {
    public  static void  main (String[]args){
          Person person=new Person("Asan",18);
          Student student=new Student("Ajar",16,"Kelechek",10);
        GirlStudent girlStudent=new GirlStudent("Masha",16,"namber:12",
                9,"Mathematics","Aikol");
        BoyStudent boyStudent=new BoyStudent("Munara",20,"namber:64",10,
                "dance","spider");
        Person[] persons={person,student,girlStudent,boyStudent};
        for (Person i:persons){
            if(i.getClass().getSimpleName().equals("Person")){
                System.out.println(i.getName());
                System.out.println(i.getAge());
                i.IAmAble();
                System.out.println("--------------");
            } else if (i.getClass().getSimpleName().equals("Student")) {
                System.out.println(i.getName());
                System.out.println(i.getAge());
                System.out.println(((Student)i).getSchoolName());
                s

            }
        }

    }
}
