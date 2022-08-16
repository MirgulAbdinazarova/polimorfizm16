package tema16ex2;

public class Dancer {

    private String name;
    private int age;

    public Dancer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void dancer() {
        System.out.println(" I am dancer and i can dance");
        System.out.println("Type:"+getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}