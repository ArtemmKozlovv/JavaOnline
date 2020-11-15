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
            for (int j = 0; j < n; j++) {
                if (i == j || i == 0 || i == n-1 || j == n - 1 - i){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n-1; i++){
            int f = 0; // первая единица в строке
            int l = 0; // последняя единица в строке
            // нахождение первой единицы
            for (int j = 0; j < n; j++){
                if (arr[i][j] == 1){
                    f = j;
                    break;
                }
            }
            for (int j = n-1; j > 0; j--){
                if (arr[i][j] == 1){
                    l = j;
                    break;
                }
            }
            if (l - f > 0) {
                for (int j = n; j > 0; j--) {
                    if (f < j && l > j) {
                        arr[i][j] = 1;
                    }
                }
            }
        }
        //вывод массива
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
