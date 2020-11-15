package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
	    // ввод чисел
	    System.out.println("Введите первое число :");
	    int a = read.nextInt();
        System.out.println("Введите второе число :");
        int b = read.nextInt();
        System.out.println("Введите третье число :");
        int c = read.nextInt();
        System.out.println("Введите четвертое число :");
        int d = read.nextInt();
        System.out.println("НОД чисел = " + nod(a, b, c, d));
    }

    public static int nod(int a, int b, int c, int d){
        int[] arr = {a, b, c, d};
        int min = a; // минимальное число из данных
        int nod = 1;
        for (int i = 0; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        for (int i = min; i >= 1; i--){
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0){
                nod = i;
                break;
            }
        }
        return nod;
    }
}
