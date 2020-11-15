package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	System.out.print("Введите размерность квадратной матрицы вида (NxN). N = ");
	int size = read.nextInt();
	double[][] arr = new double[size][size];
	for (int i = 0; i < size; i++){
	    for (int j = 0; j < size; j++){
	        arr[i][j] = Math.sin((Math.pow(i,2) - Math.pow(j,2)) / size);
        }
    }
	int p = 0; // положительное число
    for (int i = 0; i < size; i++){
        for (int j = 0; j < size; j++){
            if (arr[i][j] > 0){
                p++;
            }
        }
    }
	for (int i = 0; i < size; i++){
	    for (int j = 0; j < size; j++){
                System.out.printf("%.2f\t", arr[i][j]);
	    }
	    System.out.println();
	}
	System.out.printf("\nВ матрице %d положительных чисел.", p);
    }
}
