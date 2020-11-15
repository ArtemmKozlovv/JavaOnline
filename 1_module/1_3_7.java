package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Введите число m : ");
		int m = read.nextInt();
		System.out.print("Введите число n : ");
		int n = read.nextInt();
		int i = m;
		while(i <= n){
			for (int j = 2; j < i; j++){
				if (i % j == 0){
					System.out.println(j);
				}
			}
			i++;
		}
    }
}
