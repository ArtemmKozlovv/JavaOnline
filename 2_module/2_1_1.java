package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	System.out.println("Введите кол-во чисел в массиве : ");
	int size = read.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++){
	    System.out.printf("[%d] ", i+1);
        arr[i] = read.nextInt();
    }
     System.out.println("Введите число K : ");
	int k = read.nextInt();
	int sum = 0;
	for (int i = 0; i < size; i++){
	    if (arr[i] % k == 0){
	        sum += arr[i];
        }
    }
	System.out.println("Сумма всех чисел массива кратных K : " + sum);
    }
}
