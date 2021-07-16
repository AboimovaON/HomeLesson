package HomeWorkApp.java;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4_2 {

    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';


    public static void main(String[] args)
    {
        initMap();
        printMap();
        while (true){
            humanTurn();
            printMap();
            if (isWinner(DOT_X))
            {
                System.out.println("Вы победили!");
                break;
            }
            if (isMapFull())
            {
                System.out.println("Ничья!");
                break;
            }

            itTurn();
            printMap();
            if (isWinner(DOT_O))
            {
                System.out.println("Вы проиграли!");
                break;
            }
            if (isMapFull())
            {
                System.out.println("Ничья!");
                break;
            }
        }

    }
    public static void initMap(){
        map = new  char[SIZE][SIZE];
        for (int i =0; i < SIZE; i++) {
            for (int j = 0; j < SIZE;j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void humanTurn()
    {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do {
            System.out.println("Введите координаты в стиле X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
        while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }
    public static void itTurn(){
        Random random = new Random();
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        }
        while (!isCellValid(x, y)); {
            System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));
            map[y][x] = DOT_O;
        }
    }
    public static boolean isCellValid(int x, int y){
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY )
        {
            return true;
        }
        return false;
    }

    static boolean isWinner(char symb) {
        int endOfOffset = map.length - DOTS_TO_WIN;
        for (int rowOffset = 0; rowOffset <= endOfOffset; rowOffset++)
        {
            if (isDiagonalsFilledWith(symb, rowOffset)) {
                return true;
            }
            for (int columnOffset = 0; columnOffset <= endOfOffset; columnOffset++) {
                boolean hasWin = isLinesFilledWith(symb, rowOffset, columnOffset);
                if (hasWin)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isLinesFilledWith(char symb, int rowOffset, int columnOffset)
    {
        for (int row = rowOffset; row < (DOTS_TO_WIN + row); row ++) {
            int horizontalWinCounter = 0;
            int verticalWinCounter = 0;
            for (int column = columnOffset; column < (DOTS_TO_WIN + column); column++) {
                if (map[column][row] == symb) {
                    horizontalWinCounter++;
                } else {
                    horizontalWinCounter = 0;
                }
                if (map[row][column] == symb) {
                    verticalWinCounter++;
                } else {
                    verticalWinCounter = 0;
                }
            }
            if ((horizontalWinCounter == DOTS_TO_WIN) || (verticalWinCounter == DOTS_TO_WIN)) {
                return true;
            }
        }
            return false;
        }


    public static boolean isDiagonalsFilledWith(char symb, int rowOffset) {
        int mainDiagonalCounter = 0;
        int sideDiagonalCounter = 0;
        final int subSquareLength = (DOTS_TO_WIN + rowOffset);
        for (int row = rowOffset; row < subSquareLength; row++) {
            if (map[row][row] == symb) {
                mainDiagonalCounter++;
            } else {
                mainDiagonalCounter = 0;
            }
            if (map[row][map.length - 1 - row] == symb) {
                sideDiagonalCounter++;
            } else {
                sideDiagonalCounter = 0;
            }
        }
            return (mainDiagonalCounter == DOTS_TO_WIN) || (sideDiagonalCounter == DOTS_TO_WIN);
   }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) ;
                {
                    return false;
                }
            }
        }
        return true;
    }
}
