package tema16;

public class Cat extends Animal {

    public void mur(){
        System.out.println(" I say mur mur");
    }
    @Override
    public  void talk(){
        System.out.println("Cat is animal too" );
    }
}