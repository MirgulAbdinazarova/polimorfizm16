package tema16;

public class Main {
    public static void main(String[] args) {


        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        voice(animal);
        voice(cat);
        voice(dog);

    }
        static void voice (Animal animal){

            animal.talk();

        }

    }
