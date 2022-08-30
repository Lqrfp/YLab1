package com.example.less1;

import java.util.Random;

public class App {


    /*    Заполните двумерный массив случайным числами и выведите максимальное,
    минимальное и среднее значение.

    2. Отсортируйте массив [5,6,3,2,5,1,4,9]*/

    public static void main(String[] args) {

        int[][] array = new int[7][10];
        int[][] filledArray = fillArray(array);
        print(filledArray);

        //двумерный массив
        System.out.println(getMaximum(filledArray));
        System.out.println(getMinimum(filledArray));
        System.out.println(getMiddle(filledArray));

        //одномерный массив
        int[] arr = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        bubbleSort(arr);
        printSimpleArray(arr);

    }

    
    public static int randInt() {
        Random rand = new Random();
        int randNum;
        randNum = rand.nextInt(9) + 1;
        return randNum;

    }

    //This method is for filling a 2D array with random integers
    public static int[][] fillArray(int[][] toFill) {
        int[][] filledarray = new int[toFill.length][toFill[0].length];

        for (int r = 0; r < toFill.length; r++) {
            for (int c = 0; c < toFill[0].length; c++) {
                filledarray[r][c] = randInt();
            }
        }
        return filledarray;
    }


    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printSimpleArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static int getMaximum(int[][] array) {
        int max = array[0][0];
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array[j].length; i++) {
                if (array[j][i] > max) {
                    max = array[j][i];
                }
            }
        }
        return max;
    }

    public static int getMinimum(int[][] array) {
        int min = array[0][0];
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array[j].length; i++) {
                if (array[j][i] < min) {
                    min = array[j][i];
                }
            }
        }
        return min;
    }

    public static int getMiddle(int[][] array) {
        int length = array.length;
        if (length % 2 == 1) {
            return array[length / 2][length / 2];
        } else {
            return (array[length / 2 - 1][length - 1] + array[length / 2][0]) / 2;
        }
    }

    public static void bubbleSort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }
}
