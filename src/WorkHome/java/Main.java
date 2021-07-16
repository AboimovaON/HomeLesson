package WorkHome.java;

public class Main{
    public static void main(String[] args)
        {
            Cat cat = new Cat(200);
            Dog dog = new Dog(500, 10);
            cat.runOn(250);
            cat.swimOn(5);

            dog.runOn(50);
            dog.swimOn(5);
        }
    }

