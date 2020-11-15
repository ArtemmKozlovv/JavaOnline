package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] arr;
        int n = 5;
        arr = new int[n][n];
        int temp = 0;
        // заполнение двумерного массива
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = temp;
                temp++;
            }
        }
        System.out.println("Первоначальная матрица :");
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Введите номер первого столбца : ");
        int f = read.nextInt() - 1; // first
        System.out.println("Введите номер второго столбца : ");
        int s = read.nextInt() - 1; // second
        for (int i = 0; i < n; i++){
            temp = arr[i][f];
            arr[i][f] = arr[i][s];
            arr[i][s] = temp;
        }
        // вывод
        System.out.println("Измененная матрица :");
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
