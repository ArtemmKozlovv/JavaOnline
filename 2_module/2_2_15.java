package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = (int)(Math.random() * 15); // случайное число от 0 до 15
            }
        }
        System.out.println("Исходная атрица : ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        // поиск максимального числа матрицы
        int max = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        // замена нечетных чисел на максимальное
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (arr[i][j]%2 == 1){
                    arr[i][j] = max;
                }
            }
        }
        System.out.println("получившаяся матрица : ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
