package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Введите кол-во строк в массиве, N = ");
        int n = read.nextInt();
        System.out.print("Введите кол-во столбцов в массиве, M = ");
        int m = read.nextInt();
        int[][] arr = new int[n][m];
        // заполнение массива по стобцам
        for (int j = 0; j < m; j++){
            for (int i = 0; i < n; i++){
                if (j >= i){
                    arr[i][j] = 1;
                } else arr[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
