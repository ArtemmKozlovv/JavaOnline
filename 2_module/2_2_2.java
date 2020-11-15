package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] arr;
        System.out.println("Введите размерность матрицы (NxN): ");
        System.out.print("N = ");
        int n = read.nextInt();
        arr = new int[n][n]; // задаем размерность массива
        // заполнение двумерного массива
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("[%d][%d] = ", i, j );
                arr[i][j] = read.nextInt();
            }
        }
        System.out.println("Элементы стоящие на диагонали : ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i][i] + " ");
        }
    }
}
