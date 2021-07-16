package HomeWorkApp.java;

public class Animal {
    float maxRunDistance;
    float maxSwimDistance;

    public Animal(float maxRunDistance, float maxSwimDistance)
    {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }
    public void runOn(float requiredDistance)
    {
        if (requiredDistance > maxRunDistance)
        {
            System.out.println("Не может пробежать " + requiredDistance);
            System.out.println("Максимум возможностей: " + maxRunDistance);
        }
        else
        {
            System.out.println("Расстояние для бега " + requiredDistance + " преодолено.");
        }

        System.out.println();
    }

    public void swimOn(float requiredDistance)
    {
        if (requiredDistance > maxSwimDistance)
        {
            System.out.println("Не может проплыть " + requiredDistance);
            System.out.println("Максимум возможностей: " + maxRunDistance);
        }
        else
        {
            System.out.println("Расстояние для заплыва " + requiredDistance + " преодолено.");
        }

        System.out.println();
    }
}
