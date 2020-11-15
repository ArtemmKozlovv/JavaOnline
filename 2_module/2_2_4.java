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
        // заполнение массива по условию
        for (int i = 0; i < n; i++){
            if((i+1)%2==1){
                for (int j = 0; j < n; j++){
                    arr[i][j] = j + 1;
                }
            }
            else{
                for (int j = 0; j < n; j++){
                    arr[i][j] = n - j;
                }
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
