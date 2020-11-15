package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Введите колличество дробей : ");
        int n = read.nextInt();

        int[][] arr = new int[n][2]; // массив с элементами дроби
        // заполнение массива
        for (int i = 0; i < n; i++){
            int temp = 1;
            System.out.printf("Дробь [#%d] : \n", (i + 1));
            for (int j = 0; j < 2; j++){
               if (j == 0) {
                   System.out.print("\tВведите числитель : ");
               }else if (j == 1){
                   System.out.print("\tВведите знаменатель : ");
               }
               arr[i][j] = read.nextInt();
            }
        }
        // нахождение общего знаменателя{
        int commonDenominator = 1; // общий знаменатель
        for (int i = 0; i < n; i++) {
            commonDenominator *= arr[i][1];
        }
        // приведение всех дробей к общему знаменателю
        for (int i = 0; i < n; i++){
            arr[i][0] = arr[i][0] * (commonDenominator / arr[i][1]);
            arr[i][1] = commonDenominator;
        }
        // поставновка дробей в порядке возрастания
        for (int i = 0; i < n - 1 ; i++){
            for (int j = 0; j < n - 1; j++){
                if (arr[j][0] > arr[j + 1][0]){
                    int temp = arr[j][0];
                    arr[j][0] = arr[j + 1][0];
                    arr[j + 1][0] = temp;
                }
            }
        }
        // вывод дробей
        for (int i = 0; i < n; i++){
            System.out.printf("Дробь [#%d] : \n", (i + 1));
            for (int j = 0; j < 2; j++){
                if (j == 0) {
                    System.out.print("\tВведите числитель : ");
                }else if (j == 1){
                    System.out.print("\tВведите знаменатель : ");
                }
                System.out.println(arr[i][j]);
            }
        }
    }
}
