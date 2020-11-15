package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);

        System.out.print("Введите первое число. K = ");
        int k = read.nextInt();
        System.out.print("Введите первое число. N = ");
        int n = read.nextInt();

        int[] arr = ArrayFormation(k, n);
        for (int i =0; i < SumNumeralEqualK(k, n); i++){
            System.out.println(arr[i]);
        }
    }
    // метод формирования массива
    public static int[] ArrayFormation(int k, int n){
        int number = SumNumeralEqualK(k, n);
        int[] arr = new int[number];
        int temp = 0; // индекс итогового массива
        for (int i = 1; i <= n; i++){
            if (SumNumeral(i) == k) {
                arr[temp] = i;
                temp++;
            }
        }
        return arr;
    }

    // метод суумы всех цифр данного числа
    public static int SumNumeral(int a){
        int sum = 0;
        while(a % 10 != 0 || (int)(a / 10) != 0){
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    // метод подсчёта чисел сумма цифр которого равны k
    public static int SumNumeralEqualK(int k, int n){
        int number = 0;
        for (int i = 1; i <= n; i++){
            if (SumNumeral(i) == k){
                number++;
            }
        }
        return number;
    }
}
