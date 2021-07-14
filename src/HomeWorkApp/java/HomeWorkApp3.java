package HomeWorkApp.java;

import org.jetbrains.annotations.NotNull;
import java.util.Arrays;
public class HomeWorkApp3 {
    private static int k;

    public static void main(String[] args) {
        integerArray();
        integerArray100();
        arrayOfDigits();
        squareTwoDimensionalArray();
        lenInitialValue(1, 10);
    }


    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].  С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void integerArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int e = 0; e < arr.length; e ++) {
            if (arr[e] == 0) {
                arr[e] = arr[e] + 1;
            }
            else {
                arr[e] = arr[e] - 1;
            }
        }
        { System.out.println(Arrays.toString(arr)); }
    }

    // 2. Задать пустой целочисленный массив длиной 100.
    // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void integerArray100() {
        int[] g = new int[100];
        for (int i = 0; i < 100; i++) {
            g[i] = (i + 1);
        }
        System.out.println(Arrays.toString(g));
    }// 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,

    // и числа меньшие 6 умножить на 2;
    public static void arrayOfDigits() {
        int[] q = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int a = 0; a < q.length; a++) {
            if (q[a] < 6) {
                q[a] = q[a] * 2;
            }
        }
        System.out.println(Arrays.toString(q));
    }
    // 4. Создать квадратный двумерный целочисленный массив
// (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его
// диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу:
// индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void squareTwoDimensionalArray() {
        int [][] table = new int[10][10];
        for (int i = 0; i < table.length; i++) {
            table[i][i] = 1;
            table[i][table.length - 1 - i] = 1;
        }

        for (int j = 0; j < table.length; j++) {
            String text = Arrays.toString(table[j]);
            System.out.println(text);
        }
    }

    // 5. Написать метод, принимающий на вход два аргумента:
    // len и initialValue, и возвращающий одномерный массив типа int длиной len,
    // каждая ячейка которого равна initialValue;
    public static int[] lenInitialValue(int initialValue, int len) {
        int[] result = new int[len];

        for (k = 0; k < result.length; k++) {
            result[k] = initialValue;
        }

        System.out.println(Arrays.toString(result));
        return result;

    }

}