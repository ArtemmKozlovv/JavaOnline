package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите целое натуральное положительное число : ");
        int n, sum = 0;
        n = num.nextInt();
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.printf("Сумма всех чисел от 1 до %d : %d \n", n, sum);
    }
}
