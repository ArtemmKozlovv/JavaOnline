package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = (int)(Math.random() * 9); // случайное число от 0 до 15
            }
        }
        System.out.println("Матрица : ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Матрица элементы столбцов которой расположенны по возрастанию значений элементов : ");
        for (int j = 0; j < m; j++){
            for (int k = 0; k < n; k++){
                for (int i = 0; i < n - 1; i++) {
                    if (arr[i][j] > arr[i + 1][j]) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[i + 1][j];
                        arr[i + 1][j] = temp;
                    }
                }
            }
        }
        // Вывод
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        // -----------
        System.out.println("Матрица элементы столбцов которой расположенны по убыванию значений элементов : ");
        for (int j = 0; j < m; j++){
            for (int k = 0; k < n; k++){
                for (int i = 0; i < n - 1; i++) {
                    if (arr[i][j] < arr[i + 1][j]) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[i + 1][j];
                        arr[i + 1][j] = temp;
                    }
                }
            }
        }
        // Вывод
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
