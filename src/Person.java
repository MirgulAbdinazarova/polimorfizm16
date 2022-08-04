public class Person {

    public String name="Almaz";
    public int age;
    public int rost;
    public String citizenship;
    Computer computer=new Computer();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rost=" + rost +
                ", citizenship='" + citizenship + '\'' +
                ", computer=" + computer +
                '}';
    }
}

