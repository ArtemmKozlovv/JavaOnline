package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Введите кол-во чичсел в массиве (N) : ");
        int size = read.nextInt();
        double[] arr = new double[size * 2];
        for (int i = 0; i < size; i++){
            System.out.printf("[%d] = ", i + 1);
            arr[i] = read.nextDouble();
        }
        double max = arr[0] + arr[size-1];
        for (int i = 0; i < size; i++){
            if (max < arr[i] + arr[size-i]){
                max = arr[i] + arr[size-i];
            }
        }
        System.out.println("Максимальная сумма = " + max);
    }
}
