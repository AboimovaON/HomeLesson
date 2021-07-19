package HomeWork_7.java;

public class Main<plate, cats> {
    public static void main(String[] args){
    // 4.	Создать массив котов и тарелку с едой,
      // попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
        Cat[] cats = {
        new Cat("Мурка", 6),
        new Cat("Барсик", 7),
        new Cat("Васька", 10),
        };
        Plate plate = new Plate(20);
        for (Cat cat : cats) {
        cat.eatFrom(plate);
    }
        plate.addFood(50);
            for (Cat cat : cats) {
                cat.eatFrom(plate);
            }
        }
    }





