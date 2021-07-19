package HomeWork_7.java;

public class Cat {
    private boolean isFull;
    private String name;
    private int appetite;

    public Cat(String name, int appetite)
    {
        this.isFull = false;
        this.name = name;
        this.appetite = appetite;
    }
    public void eatFrom(Plate plate) {
        if (plate.enoughFood(appetite) && !isFull) {
            System.out.println(name + " кушaет.");
            plate.decreaseFood(appetite);
            isFull = true;
        }
        else if (!plate.enoughFood(appetite)){
            System.out.println(name + " недоволен,ведь ему не хватает еды.");
        }
        else if (isFull) {
            System.out.println(name + " в пузе уже есть еда.");
        }
    }
}
