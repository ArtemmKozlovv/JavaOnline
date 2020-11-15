package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Введите кол-во чичсел в массиве (N) : ");
        int size = read.nextInt();
        double[] arr = new double[size];
        for (int i = 0; i < size; i++){
            System.out.printf("[%d] = ", i);
            arr[i] = read.nextDouble();
        }
        double sum = 0;
        for (int i = 1; i < size; i++){
            int amount = 0; // кол-во делителей
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    amount++;
                }
            }
            if (amount <= 2){
                sum+=arr[i];
            }
        }
        System.out.println("Сумма чисел у которых порядковый номер в массиве является простым числом : " + sum);
    }
}
