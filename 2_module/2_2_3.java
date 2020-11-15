package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] arr;
        System.out.println("Введите размерность матрицы (MxN): ");
        System.out.print("M = ");
        int m = read.nextInt();
        System.out.print("N = ");
        int n = read.nextInt();
        arr = new int[m][n]; // задаем размерность массива
        // заполнение двумерного массива
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("[%d][%d] = ", i, j );
                arr[i][j] = read.nextInt();
            }
        }
        System.out.print("Введите номер строки которую нужно вывести :");
        int k = read.nextInt();
        System.out.print("Введите номер столбца который нужно вывести :");
        int p = read.nextInt();
        System.out.println("Строка : ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[k-1][i] + " ");
        }
        System.out.println("\nСтолбец : ");
        for (int i = 0; i < m; i++){
            System.out.print(arr[i][p-1] + " ");
        }
    }
}
