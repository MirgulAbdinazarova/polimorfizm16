package Person;

public class Main2 {
    public static void main(String[]args){
        Programmer programmer=new Programmer("Munara","Write cod"
                ,"Shoro");
        Dancer dancer=new Dancer("Biichiler","Zina","Dancing");
        Singer singer=new Singer("Solnychko","Ailin","Sings");


        System.out.println(programmer);
        programmer.coding();
        programmer.eat();
        programmer.learn();
        programmer.walk();
        System.out.println("------------------");
        System.out.println(dancer);
        dancer.dansing();
        dancer.eat();
        dancer.learn();
        dancer.walk();
        System.out.println("-------------------");
        System.out.println(singer);
        singer.singing();
        singer.playGitar();
        singer.eat();
        singer.learn();
        singer.walk();
    }
}
