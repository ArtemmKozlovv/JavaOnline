package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Введите кол-во чисел в массиве (N) : ");
        int size = read.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            System.out.printf("[%d] - ", i);
            arr[i] = read.nextInt();
        }
        int max = 0; // максимальное число повторений
        // поиск максимальноого повторения числа
        for (int i = 0; i < size; i++){
            int tempMax = 0;
            for (int j =0; j < size; j++){
                if (arr[i] == arr[j]){
                    tempMax++;
                }
            }
            if (max < tempMax){
                max = tempMax;
            }
        }
        // кол-во чисел с максимальным повторением
        int amount = 0; // кол-во чисел с максимальным поветорением
        for (int i = 0; i < size; i++){
            int tempMax = 0;
            for (int j =0; j < size; j++){
                if (arr[i] == arr[j]){
                    tempMax++;
                }
            }
            if (max == tempMax){
                amount++;
            }
        }
        int[] arr1 = new int[amount];
        int k = 0;
        // все числа которые повторяются максимальное кол-во раз записываются в массив
        for (int i = 0; i < size; i++){
            int tempMax = 0;
            for (int j =0; j < size; j++){
                if (arr[i] == arr[j]){
                    tempMax++;
                }
            }
            if (max == tempMax){
                    arr1[k] = arr[i];
                    k++;
            }
        }
        // выбор минимального числа в новом массиве
        int min = arr1[0];
        for (int i = 0; i < amount; i++){
            if (min > arr1[i]){
                min = arr1[i];
            }
        }
        System.out.println("Минимальное число с наибольшим повторение : " + min);
    }
}
