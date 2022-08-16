package tema16ex2;

public class Main {
    public static void main(String[] args) {
        Dancer dancer = new Dancer("Azaliya", 15);
        Dancer dancer1 = new TiktonikDancer("Daniyar", 12);
        Dancer dancer2 = new BreakDancer("Almaz", 6);
        Dancer dancer3 = new BreakDancer("Aza", 17);


        Dancer[] dancers = {dancer, dancer1, dancer2, dancer3};
        for (Dancer i : dancers){
            System.out.println(i.getName());
            System.out.println(i.getAge());
            i.dancer();
            System.out.println("------------");
        }

    }


}