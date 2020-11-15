package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Введите натуральное число K : ");
        int k = read.nextInt();
        PrintAmstrong(k);
    }
    // вывод чисел Амстронга в массиве
    public static void PrintAmstrong(int k){
        for (int i = 1; i <= k; i++){
            if (CountAmstrong(i) == 1){
                System.out.print(i + " ");
            }
        }
    }
    // проверка на число Амстронга
    public static int CountAmstrong(int k){
        double temp = Math.pow(SumDigitsOfNumbers(k),DigitsOfNumbers(k));
        if (k == (int)temp){
            return 1;
        } else return 0;
    }
    //кол-во цифр в числе
    public static int DigitsOfNumbers(int k){
        int temp = 0;
        while (k != 0){
            temp++;
            k /= 10;
        }
        return temp;
    }
    //сумма цифр в числе
    public static int SumDigitsOfNumbers(int k){
        int sum = 0;
        while (k != 0){
            sum += k%10;
            k /= 10;
        }
        return sum;
    }
}
