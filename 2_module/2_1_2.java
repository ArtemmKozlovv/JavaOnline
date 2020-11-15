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
	System.out.println("Введите число Z : ");
	double z = read.nextDouble();
	int amount = 0;
	for (int i = 0; i < size; i++){
	    if (arr[i] > z){
	        arr[i] = z;
	        amount++;
        }
    }
	// Вывод овтета
    for (int i = 0; i < size; i++){
        System.out.printf("[%d] = %.3f\n", i + 1, arr[i]);
    }
    System.out.print("Кол-во замен : " + amount + "\n");
    }
}
