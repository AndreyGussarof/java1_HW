package java1_HW.homework2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 0, 0, 1, 0, 1, 1};
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr1));


        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr3));

        int[][] arr2d = new int[10][10];
        {
            for (int i = 0; i < arr2d.length; i++) {
                for (int j = 0; j < arr2d.length; j++) {
                    if (i == j || (i + j) == arr2d.length - 1) {
                        arr2d[i][j] = 1;
                    }
                    System.out.print("\t" + arr2d[i][j]);
                }
                System.out.println();
            }
        }


        int[] arr5 = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = rand.nextInt(50);
        }
        System.out.println(Arrays.toString(arr5));
        //Max
        int max = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] >= max) {
                max = arr5[i];
            }
        }
        System.out.println("max = " + max);
        //Min
        int min = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] <= min) {
                min = arr5[i];
            }
        }
        System.out.println("min = " + min);

        int sum = 0;

        for (int i = 0; i < arr5.length; i++) {
                sum = sum + arr5[i];
        }
            System.out.println("sum = " + sum);
        //chekBalance попытка
//        for (int i = 0; i <arr5.length ; i++) {
//            arr5[i]=arr5[i]+arr5[i+1];
//                if (arr5[i] == sum -arr5[i]){
//                    System.out.println(" true ");
//                }
//            }
        }

    }

