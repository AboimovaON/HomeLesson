package HomeWorkApp.java;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }
    public static void checkSumSign() {
    int a = 5;
    int b = - 7;

       if (a + b >= 0){
        System.out.println("“Сумма положительная”");
    } else if (a + b < 0){
        System.out.println("“Сумма отрицательная”");
    }
    }
    public static void printColor() {
        int value = 55;
        if (value <= 0){
            System.out.println("Красный");
            } else if (value > 0 && value < 100){
            System.out.println("Желтый");
            } else if (value > 100){
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 15;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else if (a < b) {
            System.out.println("a < b");
        }
    }
}