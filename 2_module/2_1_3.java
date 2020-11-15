package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Введите кол-во чичсел в массиве (N) : ");
        int size = read.nextInt();
        double[] arr = new double[size];
        for (int i = 0; i < size; i++){
            System.out.printf("[%d] = ", i + 1);
            arr[i] = read.nextDouble();
        }
        int p = 0; //positive number
        int n = 0; // negative number
        int z = 0; // zero
        for (int i = 0; i < size; i++){
            if (arr[i] > 0)p++;
            else if (arr[i] < 0)n++;
        }
        z = size - p - n;
        System.out.printf("Кол-во чисел в массиве :\n1) Положительных - %d\n2) Отрицательных - %d\n3) Нулевых элементов - %d\n", p, n, z);
    }
}
