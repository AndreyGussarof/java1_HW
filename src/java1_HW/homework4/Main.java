package java1_HW.homework4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static final int SIZE = 3;
    static final int DOT_TO_WIN = 3;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

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

            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();

            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }


            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
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
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате Y X");
            y = sc.nextInt() - 1;
            x = sc.nextInt() - 1;
        }
        while (!isCellValid(y, x));
        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x, y;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_O;
                    if (checkWin(DOT_O)) {
                        map[i][j] = DOT_O;
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }


        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_X;
                    if (checkWin(DOT_X)) {
                        map[i][j] = DOT_O;
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
        do {
            y = random.nextInt(SIZE);
            x = random.nextInt(SIZE);
        }
        while (!isCellValid(y, x));
        map[y][x] = DOT_O;
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;

    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    static boolean checkLine(int cy, int cx, int vy, int vx, char dot) {
        if (cx + vx * DOT_TO_WIN - 1 > SIZE - 1 || cy + vy * DOT_TO_WIN - 1 > SIZE - 1 || cy + vy * DOT_TO_WIN - 1 < 0) {
            return false;
        }
        for (int i = 0; i < DOT_TO_WIN; i++) {
            if (map[cy + i * vy][cx + i * vx] != dot) {
                return false;
            }
        }
        return true;
    }
static boolean checkWin(char dot){
    for (int i = 0; i <SIZE ; i++) {
        for (int j = 0; j <SIZE ; j++) {
         if(checkLine(i , j , 0 , 1 , dot) ||checkLine(i , j ,1 ,0 , dot)||
         checkLine(i , j , 1 , 1 , dot)||checkLine(i , j , -1 ,1 , dot)){
             return true;
         }
        }
    }
    return false;
}



//    public static boolean checkWin(char symb) {
//       if(checkWinHorizontal(symb)){return true;};
//       if(checkWinVertical(symb)){return true;};
//       if(checkWinDioganal(symb)){return true;};
//        return false;
//    }

//    public static boolean checkWinHorizontal(char symb) {
//        int count = 1;
//        int j = 0;
//        for (int i = 0; i < SIZE; i++) {
//            if (map[i][j] == symb) {
//                count++;
//            }
//            if (count == DOT_TO_WIN) {
//                return true;
//            }
//        } return false;
//    }


//   public static boolean checkWinVertical(char symb) {
//        int i = 0;
//            for (int j = 0; j < SIZE; j++) {
//                if (map[i][j] == symb && map[SIZE-2][j] == symb && map[SIZE-1][j] == symb) {
//                    return true;
//                }i++;
//            }return false;
//   }

//    public static boolean checkWinDioganal(char symb) {
//
//                if (map[0][0] == symb && map[SIZE - 2][SIZE - 2] == symb && map[SIZE - 1][SIZE - 1] == symb) {
//                    return true;
//                } else if (map[2][0] == symb && map[SIZE - 2][SIZE - 2] == symb && map[0][2] == symb) {
//                    return true;
//                }return false;
//    }


//        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//
//        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//
//        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
//        return false;


}


