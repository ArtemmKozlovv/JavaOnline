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
        System.out.println("Матрица элементы строк которой расположенны по возрастанию значений элементов : ");
        for (int i = 0; i < n; i++){
            for (int k = 0; k < m; k++){
                for (int j = 0; j < m - 1; j++) {
                        if (arr[i][j] > arr[i][j + 1]) {
                            int temp = arr[i][j];
                            arr[i][j] = arr[i][j + 1];
                            arr[i][j + 1] = temp;
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
        System.out.println("Матрица элементы строк которой расположенны по убыванию значений элементов : ");
        for (int i = 0; i < n; i++){
            for (int k = 0; k < m; k++){
                for (int j = 0; j < m - 1; j++) {
                    if (arr[i][j] < arr[i][j + 1]) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][j + 1];
                        arr[i][j + 1] = temp;
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
