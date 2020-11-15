package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Введите натуральное число больше двух. N = ");
        int n = read.nextInt();
        System.out.printf("\n\tПеречень пар, чисел 'близнецов', из промежутка чисел [%d, %d] :\n", n, 2*n);
        ArrayToTwins(n);
    }
    // посчёт колличества элементов массива [n;2n]
    public static int NumberOfNumbers(int n){
        return 2*n - n + 1;
    }
    // вывод из массива [n;2n] чисел "близнецов"
    public static void ArrayToTwins(int n){
        int temp = 1; // пронумеровка пар
        for (int i = n; i <= n*2-2; i++){
            System.out.printf("\t\t[%d] - (%d, %d)\n", temp, i, i+2);
            temp++;
        }
    }
}
