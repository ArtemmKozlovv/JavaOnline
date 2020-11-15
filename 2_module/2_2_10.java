package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] arr;
        int n = 3;
        arr = new int[n][n];
        arr[0][0]=-4;
        arr[0][1]=6;
        arr[0][2]=3;
        arr[1][0]=1;
        arr[1][1]=2;
        arr[1][2]=2;
        arr[2][0]=4;
        arr[2][1]=5;
        arr[2][2]=0;
        System.out.println("Первоначальная матрица :");
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("Положительные элементы на главной диагонали : " );
        for (int i = 0; i < n; i++){
            if (arr[i][i] > 0){
                System.out.print(arr[i][i] + " ");
            }
        }
    }
}
