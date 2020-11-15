package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner read = new Scanner(System.in);

	System.out.print("Введите размерность первого массива : ");
	int n = read.nextInt();

	System.out.println("Ввод первого массива :");
	int[] arr = new int[n];
	for (int i = 0; i < n; i++){
	    System.out.printf("[%d] = ", i+1);
	    arr[i] = read.nextInt();
    }

    System.out.print("Введите размерность второго массива : ");
	int m = read.nextInt();

	System.out.println("Ввод первого массива :");
	int[] arr1 = new int[m];
	for (int i = 0; i < m; i++){
		System.out.printf("[%d] = ", i+1);
		arr1[i] = read.nextInt();
	}

	System.out.printf("Введите натуральное число k (от 1 до %d) : ", n);
	int k = read.nextInt();
	// проверка
	if (k > n || k < 1){
		System.out.println("В первом массиве нет элемента с таким порядковым номером !");
		System.exit(0);
	}

	System.out.println("Вывод объединенного массива : ");
	for (int i = 0; i < n; i++){
		System.out.print(arr[i] + " ");
		if (i == k-1) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr1[i] + " ");
			}
		}
	}
    }
}
