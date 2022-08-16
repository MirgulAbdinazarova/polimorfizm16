package tema16ex3;

public class GirlStudent extends Student {
    private  String favoriteSubject;
    private String teamMate;

    public GirlStudent(String name,int age,String schoolName,int grade,String favoriteSubject,
                       String teamMate){
        super(schoolName,grade,name,age);
        this.favoriteSubject=favoriteSubject;
        this.teamMate=teamMate;
    }
    public String getFavoriteSubject(){
        return favoriteSubject;
    }
    public String getTeamMate(){
        return teamMate;
    }
    public void iLoveToDo(){
        System.out.println(" i love to play a piano");
    }
}
