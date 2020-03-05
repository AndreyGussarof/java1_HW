package java1_HW.homework3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        int end = 1;
        do {
            int askNumber = rand.nextInt(10);
            System.out.println(" Привет !Попробуйте угадать число от 0 до 9 .\nУ вас есть 3 попытки .");
//            System.out.println("Загаданное число " + askNumber);
            int tryCount = 0;

            for (int i = 0; i < 3; i++) {
                System.out.println("Введите число : ");
                int x = sc.nextInt();
                tryCount = tryCount + 1;
                if (x < askNumber && (tryCount - 3) != 0) {
                    System.out.println("Загаданное число больше.Попробуйте ещё раз.У вас есть " + (3 - tryCount) + " попытки");
                } else if (x > askNumber && (tryCount - 3) != 0) {
                    System.out.println("Загаданное число меньше.Попробуйте ещё раз.У вас есть " + (3 - tryCount) + " попытки");
                } else if (x == askNumber && (tryCount - 3) != 0) {
                    System.out.println("Вы угадали.Правильный ответ :" + askNumber);
                    break;
                } else {
                    System.out.println("Вы проиграли.Правильный ответ : " + askNumber);
                }
            }
            System.out.println("Если хотите продолжить, нажмите  1 , если хотите закончить, нажмите  0");
            end = sc.nextInt();
        }
        while (end != 0);
    }
}

