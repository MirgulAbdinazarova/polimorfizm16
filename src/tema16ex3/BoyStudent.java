package tema16ex3;

public class BoyStudent extends Student{

    private  String hobby;
    private String phobia;


    public BoyStudent(String name,int age,String schoolName,int grade,
                      String hobby,String phobia){
        super(name,age,schoolName,grade);
        this.hobby=hobby;
        this.phobia=phobia;

    }
    public String getHobby(){
        return  hobby;
    }
    public  String getPhobia(){
        return  phobia;
    }
    public void iHateToDo(){
        System.out.println("I hate to read books and chines food");
    }
}