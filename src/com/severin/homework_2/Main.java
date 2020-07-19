package com.severin.homework_2;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task №1");
        task1();
        System.out.println("Task №2");
        task2();
        System.out.println("Task №3");
        task3();
        System.out.println("Task №4");
        task4();
    }

    //      1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    //      С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void task1() {
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < 10; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(arr[j]);
        }
    }

    //      2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void task2() {
        int[] arr = new int[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = i * 3;
        }

        for (int j = 0; j < 8; j++) {
            System.out.println(arr[j]);
        }
    }

    //      3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void task3() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int k = 0; k < 12; k++) {
            if (arr[k] < 6) {
                arr[k] = arr[k] * 2;
            }
        }

        for (int n = 0; n <= 11; n++) {
            System.out.println(arr[n]);
        }
    }

    //      4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
    //      заполнить его диагональные элементы единицами;
    public static void task4() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else if (i + j == arr[i].length - 1){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}

