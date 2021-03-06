package Lesson4;

import java.util.Random;
import java.util.Scanner;

 public class Lesson4 {

     public static int SIZE = 5;
     public static char DOT_X = 'x';
     public static char DOT_O = '0';
     public static char DOT_EMPTY = '.';
     char [][] map = new char [SIZE][SIZE];
     Scanner sc = new Scanner(System.in);
     Random rand = new Random();

     public static void main (String[] args) {
          new Lesson4().go();
     }

     void go() {
          initMap();
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
                    System.out.println("Победил компьютер");
                    break;
               }
               if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
               }
          }
          System.out.println("Игра закончена");
     }

               void initMap() {
                    for (int i = 0; i < SIZE; i++) {
                         for (int j = 0; j < SIZE; j++) {
                              map[i][j] = DOT_EMPTY;
                         }
                    }
               }

               void humanTurn() {
                    int x, y;
                    do {
                         System.out.println("Введите координаты в формате  X Y (1-5)");
                         x = sc.nextInt() - 1;
                         y = sc.nextInt() - 1;
                    } while (!isCellValid(x, y));
                    map[y][x] = DOT_O;
               }

               void aiTurn() {
                    int x, y;
                    do {
                         x = rand.nextInt(SIZE);
                         y = rand.nextInt(SIZE);
                    } while (!isCellValid(x, y));
                    map[y][x] = DOT_O;
               }
               void printMap() {
                   for (int i = 0; i < SIZE; i++) {
                       for (int j = 0; j < SIZE; j++) ;
                       System.out.println(map[i][i] + " ");
                   }
                   System.out.println();
               }



          boolean checkWin(char dot) {
               int diag1, diag2, hor, ver;
               for (int i = 0; i < SIZE; i++) {
                   hor = 0;
                   ver = 0;
                   for (int j = 0; j < SIZE; j++) {
                   if (map[i][j] == dot) {
                       hor++;
                   }
                    if (map[j][i] == dot) {
                         ver++;
                    }
               }
               if (hor == SIZE || ver == SIZE){
                    return true;
               }
          }
          diag1 = 0;
          diag2 = 0;
          for (int i = 0; i < SIZE; i++) {
               if (map[i][i] == dot) {
                    diag1++;
               }
               if (map[i][SIZE - i - 1] == dot) {
                    diag2++;
               }
          }
          if (diag1 == SIZE || diag2 == SIZE) {
               return true;
          }
          return false;
     }

     boolean isMapFull() {
          for (int i = 0; i < SIZE; i++) {
               for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) return false;
               }
          }
          return true;
     }

     boolean isCellValid(int x, int y) {
          if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) return false;
          if (map[y][x] == DOT_EMPTY) return true;
          return false;
     }
}



