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
        int maxID = 0, minID = 0;
        double max = arr[0],min = arr[0];
        for (int i = 0; i < size; i++){
            if (max < arr[i]){
                max = arr[i];
                maxID = i;
            }
            if (min > arr[i]){
                min = arr[i];
                minID = i;
            }
        }
        double temp = arr[minID];
        arr[minID] = arr[maxID];
        arr[maxID] = temp;
        for (int i = 0; i < size; i++){
            System.out.printf("Отредактированный вид массива :\n[%d] = %.3f\n", i + 1, arr[i]);
        }
    }
}
