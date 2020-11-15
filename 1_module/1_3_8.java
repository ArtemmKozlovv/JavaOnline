package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int num1, num2; // num1 - первое число, num2 - второе число
        System.out.print("Введите первое число : ");
        num1 = read.nextInt();
        System.out.print("Введите второе число : ");
        num2 = read.nextInt();
        // кол-во цифр в первом числе
        int temp = num1;
        int l1 = 0; // кол-во цифр первого числа
        while (temp != 0) {
            temp /= 10;
            l1++;
        }
        // кол-во цифр во втором числе
        temp = num2;
        int l2 = 0; // кол-во цифр второго числа
        while (temp != 0) {
            temp /= 10;
            l2++;
        }
        // цикл проверки повторения цифры в двух числах
        for (int i = 0; i <= 9; i++){
            int n1 = num1;
            int n2 = num2;
            temp = 0;
            //проверка первого числа
            for (int j = 0; j < l1; j++){
                if (n1 % 10 == i){
                    temp++;
                    break;
                }
                n1 /= 10;
            }
            //проверка второго числа
            for (int j = 0; j < l2; j++){
                if (n2 % 10 == i){
                    temp++;
                    break;
                }
                n2 /= 10;
            }
            //вывод цифры если она повторяется в двух числах
            if (temp == 2){
                System.out.println(i);
                continue;
            }
        }
    }
}
