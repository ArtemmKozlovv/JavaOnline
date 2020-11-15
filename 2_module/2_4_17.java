package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
        System.out.print("Введите число : ");
        int a = read.nextInt();

        int n = CountingActions(a);
        System.out.println("Колличество действий (разница числа и суммы цифр этого числа) до достяжения нуля : " + n);
    }
    // кол-во действий, разница числа и суммы цифр этого числа, до достяжения нуля
    public static int CountingActions(int a){
        int count = 0;
        while (a > 0){
            a = Difference(a, SumOfDigits(a));
            count++;
        }
        return count;
    }
    // сумма цифр данного числа
    public static int SumOfDigits(int a){
        int sum = 0;
        int n = DigitsInNumber(a); // кол-во цифр в числе
        int[] arr = IntToArr(a, n);
        for (int i = 0; i < n; i++){
            sum += arr[i];
        }
        return sum;
    }
    // кол-во цифр в числе
    public static int DigitsInNumber(int a){
        int n = 0;
        while (a != 0){
            a /= 10;
            n++;
        }
        return n;
    }
    // цифры числа в массив
    public static int[] IntToArr(int a, int n){
        int[] arr = new int[n];
        for (int i = n-1; i >= 0; i--){
            arr[i] = a % 10;
            a = (int)(a/10);
        }
        return arr;
    }
    // разница числа и суммы цифр этого число
    public static int Difference(int a, int sum){
        return a - sum;
    }

}
