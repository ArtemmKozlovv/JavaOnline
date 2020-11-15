package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
    System.out.print("Введите кол-во элементов в массиве : ");
    int size = read.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++){
	    System.out.printf("[%d] = ", i);
	    arr[i] = read.nextInt();
    }
	int j = 1;
	for (int i = 2; i < size; i = i + 2){
		arr[j] = arr[i];
		j++;
    }
	if(size % 2 == 0){
		for (int i = size/2; i < size; i++){
			arr[i] = 0;
		}
	} else{
		for (int i = size/2 + 1; i < size; i++){
			arr[i] = 0;
		}
	}
	for (int i = 0; i < size; i++){
	    System.out.printf("[%d] = %d\n", i, arr[i]);
	}
    }
}
