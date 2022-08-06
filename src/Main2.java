import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word= scanner.nextLine();
        soz(word);

    }
    public static void soz(String word){
        String ruzalt=word.toUpperCase(Locale.ROOT);
        String ruzalt1=word.trim();
        System.out.println(ruzalt1);

    }

}





