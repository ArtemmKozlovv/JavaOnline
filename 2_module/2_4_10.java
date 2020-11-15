package com.company;
import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);

        System.out.print("Введите число : ");
        int number = read.nextInt();

        NumToArr(number);
    }

    public static void NumToArr(int n){
        int temp = CountInt(n);
        int[] arr = new int[temp];
        for (int i = 0; i < temp; i++){
            arr[i] = (int)n%10;
            n /= 10;
        }
        int temp1 = 1;
        for (int i = temp-1; i >= 0; i--){
            System.out.println("[" + temp1 + "] - " + arr[i]);
            temp1++;
        }
    }

    // подсчет кол-ва цифр в числе
    public static int CountInt(int n){
        int count = 1; // степень десятки
        int temp = 10;
        while (n % temp != n ){
            temp *= 10;
            count++;
        }
        return count;
    }

}
