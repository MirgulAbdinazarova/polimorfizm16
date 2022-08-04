import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // массивдин эн чон санын табуу
     /*   int[] arr = new int[10];
        int max=0;
        System.out.println(med(arr,max));
    }

    public static int med(int[] arr,int max) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 50);
        }
        System.out.println(Arrays.toString(arr));
         max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;*/


        // 10 кичине сандарды 0 айлантуу
  /*  int[] arr={1,5,65,89,7,45,1,15};
        System.out.println("Do"+Arrays.toString(arr));
        System.out.println("Posle"+Arrays.toString(meth(arr)));

    }
    public  static int[] meth(int[] onKich){
        for (int i = 0; i < onKich.length; i++) {
            if (onKich[i]<10){
                onKich[i]=0;
            }
        }
        return onKich; */

       Computer computer=new Computer();
        computer. model="Lenovo";
        computer.color="black";
        computer.price=50000;
        computer.ram=8;
        computer.ssd=256;
        computer.weight=2.5;
        System.out.println(computer);

    }
    }