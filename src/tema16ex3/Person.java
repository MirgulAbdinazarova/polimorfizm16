package tema16ex3;

public class Person {
    private String name;
    private int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void IAmAble(){
        System.out.println("I am student person and i am able to walk");
    }
    public String getName(){
    return  name;
    }
    public  int getAge() {
        return age;
    }
}
