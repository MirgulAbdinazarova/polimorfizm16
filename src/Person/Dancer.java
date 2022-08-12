package Person;

public class Dancer extends Person {
    private String groupName;

    public Dancer(String groupName,String name,String designation) {
          super(name,designation);
          this.groupName=groupName;
    }
    public void dansing(){
        System.out.println("I like dans");
    }
    public String getGroupName(){
        return  groupName;
    }

    @Override
    public String toString() {
        return "Dancer:" +super.toString()+
                ",groupName=" + groupName + '\'';
    }
}
