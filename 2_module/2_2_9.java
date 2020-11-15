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
        int maxSum = 0;
        for (int j = 0; j < n; j++){
            int sum = 0;
            for(int i = 0; i < n; i++){
                sum += arr[i][j];
            }
            if (maxSum < sum){
                maxSum = sum;
            }
        }
        System.out.println("Максимальная сумма жлементов с столбце по номером :");
        for (int j = 0; j < n; j++){
            int sum = 0;
            for(int i = 0; i < n; i++){
                sum += arr[i][j];
            }
            if (maxSum == sum){
                System.out.print(j+1 +  " ");
            }
        }
    }
}
