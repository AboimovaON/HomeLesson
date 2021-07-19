package HomeWork_7.java;

public class Plate{
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int appetite){
        if (!enoughFood(appetite)){
        System.out.println("Кот не наестся.");
        }
        else{
            food = food - appetite;
        }
    }

    public boolean enoughFood(int appetite){
        return appetite < food;
    }
    public void addFood(int countOfFood) {
    food += countOfFood;
    }
}
