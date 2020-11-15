package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	System.out.println("Введите число 'e' чтобы оно было положительное и меньше единицы (например 0,1) : ");
	double e = read.nextDouble();
	double sum = 0;
	int n = 1;
	while (e <= (Math.pow(2,-n) + Math.pow(3,-n))){
        sum += Math.pow(2,-n) + Math.pow(3,-n);
        n++;
    }
	System.out.println(sum);
    }
}
