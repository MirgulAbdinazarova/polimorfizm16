public class Computer {


        public String model="Lenovo";
        public double  weight=2.5;
        public int ram=8;
        public int ssd=256;
        public String color="black";
        public int  price= 50000;

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}



