package java1_HW.homework1;

import static java1_HW.homework1.TaskMethods.*;

public class Main {

    public static void main(String[] args) {
        task1();
        result(1.25f, 2.25f, 3.25f, 4.25f);
        task1020(4, 16);
        isPositiveOrNegative(-10);
        task6(-10);
        printHelloName("Andrey");
        leapYear(250);
    }
}

class TaskMethods {
    public static void task1() {
        byte a = 127;
        short b = 2000;
        int c = 4000;
        long d = 2000L;
        float e = 12.5f;
        double f = 125.5;
        char g1 = 70;
        char g2 = 'a';
        char g3 = '\u2424';
        boolean h1 = true;
        boolean h2 = false;
        System.out.println(a + " , " + b + " , " + c + " , " + d + " , " + e + " , " + f + " , " + g1 + " , " + g2 + " , " + g3 + " , " + h1 + " , " + h2);
    }

    public static float result(float a, float b, float c, float d) {
        return a * (b + c / d);
    }

    public static boolean task1020(int x1, int x2) {
        int c = x1 + x2;
        if (c > 10 && c < 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int x) {

        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отритцательное");
        }
    }

    public static boolean task6(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printHelloName(String n) {
        System.out.println("Привет" + n);
    }

    public static void leapYear(int c) {
        if (c % 4 == 0 && c % 100 !=0 || c % 400 == 0  )  {
            System.out.println(c + " Этот год- високосный");
        } else {
            System.out.println(c + " Этот год- не високосный");
        }

    }
}
