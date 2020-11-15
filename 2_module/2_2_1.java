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
        for (int i = 0; i < n; i+=2){ // перебераем циклом нечетные столбцы
            //задаем условие задания
            if (arr[0][i] > arr[m-1][i]){
                System.out.println("\nУсловию подходт столбец №" + (i+1));
                for (int j = 0; j < m; j++){
                    System.out.print(arr[j][i] + " ");
                }
            }
        }
    }
}
