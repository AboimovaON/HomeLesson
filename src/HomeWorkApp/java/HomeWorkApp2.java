package HomeWorkApp.java;

public class HomeWorkApp2 {
    public static void main(String[] args){

        boolean flag = countC();
        System.out.println(flag);

        PositiveNegative(-0);

        boolean nP = isNegative(15);
        System.out.println(nP);

        printWord("There is no trial either.", 3);

    }
    public static boolean countC() {
        // 1. Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.
        int a = 11;
        int b = 10;
        int value = a + b;

        return (value >= 10 && value <= 20);
    }
    public static void PositiveNegative(int x) {
                    // 2. Написать метод, которому в качестве параметра передается целое число,
        // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        // Замечание: ноль считаем положительным числом.
        if (x < 0)
        System.out.println("Число отрицательное");
        else  if (x >= 0)
        System.out.println("Число положительноe");
    }
    public static boolean isNegative(int y){
        // 3. Написать метод, которому в качестве параметра передается целое число.
        // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        return (y < 0);
    }
    public static void printWord(String text, int w) {
        // 4. Написать метод, которому в качестве аргументов передается строка и число,
        // метод должен отпечатать в консоль указанную строку, указанное количество раз;
       for (int i = 0; i < w; i++)
        System.out.println(text);
    }
}
