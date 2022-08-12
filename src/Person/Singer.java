package Person;

public class Singer extends Person{
    private String bandname;

    public Singer(String bandname,String name, String designation){
           super(name,designation);
           this.bandname=bandname;
    }
    public void singing(){
        System.out.println("I can sing");
    }
    public void playGitar(){
        System.out.println("I like to play gitar");
    }
    public String getBandname(){
        return bandname;
    }

    @Override
    public String toString() {
        return "Singer" +super.toString()+
                ",bandname=" + bandname + '\'';
    }
}
