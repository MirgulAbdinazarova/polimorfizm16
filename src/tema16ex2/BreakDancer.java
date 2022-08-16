package tema16ex2;

public class BreakDancer extends Dancer {

    public BreakDancer(String name,int age){
        super(name, age);
    }
    @Override
    public void dancer(){
        System.out.println("I am break dancer and i can dance breakdance");
    }
    }