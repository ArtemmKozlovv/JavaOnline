package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Введите кол-во чисел в массиве (N) : ");
        int size = read.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            System.out.printf("[%d] = ", i + 1);
            arr[i] = read.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < size; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        int j = 1;
        for (int i = 0; i < size; i++){
            if (arr[i] != min){
                System.out.printf("[%d] = %d\n",j , arr[i]);
                j++;
            }
        }
    }
}