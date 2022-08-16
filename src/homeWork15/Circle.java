package homeWork15;

import java.util.Scanner;

public class Circle {
    private  double  Pi;

    public Circle(double Pi){
        this.Pi=Pi;
    }

    public  static void area(double PI){
        Scanner scanner=new Scanner(System.in);
        double radius= scanner.nextDouble();
        double s=Pi*(radius*radius);
        System.out.println(area);
    }
    public static void circumference(){

    }
    public double getPi(){
        return Pi;
    }

}
