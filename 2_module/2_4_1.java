package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Введите первое число :");
        int a = read.nextInt();
        System.out.println("Введите второе число :");
        int b = read.nextInt();
        int nod = nod(a, b);
        int nok = nok(a, b, nod);
        System.out.println("НОД указанных чисел = " + nod);
        System.out.println("НОК указанных чисел = " + nok);
    }

    // метод подсчёта НОД
    public static int nod(int a, int b){
        int temp;
        if (a < b) temp = a;
        else temp = b;
        int nod = 0;
        for (int i = temp; i >= 1; i--){
            if (a % i == 0 && b % i ==0){
                nod  = i;
                break;
            }
        }
        return nod;
    }
    // метод подсчёта НОК
    public static int nok(int a, int b, int nod){
        if (nod != 0) {
            return a * b / nod;
        }else {
            return 1;
        }
    }
}
