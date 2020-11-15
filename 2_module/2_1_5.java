package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Введите кол-во чичсел в массиве (N) : ");
        int size = read.nextInt();
        int[] arr = new int[size]; // исходный массив
        for (int i = 0; i < size; i++){
            System.out.printf("[%d] = ", i);
            arr[i] = read.nextInt();
        }
        System.out.println("Вывод элементов массива соответствующие условию :");
        for (int i = 0; i < size; i++){
            if (arr[i] < i){
                System.out.printf("[%d] = %d\n", i, arr[i]);
            }
        }
    }
}
