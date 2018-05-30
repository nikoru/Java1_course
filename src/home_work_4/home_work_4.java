package home_work_4;

import java.util.Random;
import java.util.Scanner;

public class home_work_4 {
    public static char[][] map;
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static char DOT_EMPTY = '*';
    public static char DOT_X = 'X';
    public static char DOT_O = '0';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил AI");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");

    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i <SIZE ; i++) {
            for (int j = 0; j < SIZE; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i+1);
        }
        System.out.println(" ");

        for (int i = 0; i < SIZE ; i++) {
            for (int j = 0; j < SIZE; j++){
                System.out.print(map[i][j]);
            }
            System.out.println(" ");
        }
    }

    public static void humanTurn(){
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y){
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void aiTurn(){
        int x;
        int y;

        do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер занял точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean checkWin(char symb) {
        int winCount;

        for (int i = 0; i < SIZE; i++) { //Проверка "горизонтальных" выйгрышей
            winCount = 0;
            for (int j = 0; j < SIZE; j++){
                if (map[i][j] == symb) winCount++;
                    else break;
                if (winCount == DOTS_TO_WIN) return true;
            }
        }

        for (int i = 0; i < SIZE; i++) { //Проверка "вертикальных" выйгрышей
            winCount = 0;
            for (int j = 0; j < SIZE; j++){
                if (map[j][i] == symb) winCount++;
                    else break;
                if (winCount == DOTS_TO_WIN) return true;
            }
        }

        for (int i = 0; i < SIZE; i++) { //Проверка диагональных выйгрышей для любого размера
            for (int j = 0; j < SIZE; j++) {
                winCount = 0;
               for (int k = i, l = j; (k <SIZE) & (l < SIZE); k++, l++ ){
                   if (map[k][l] == symb) winCount++;
                   else break;
                   if (winCount == DOTS_TO_WIN) return true;
               }
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
}
