package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Введите порядок чисел : ");
        int n = read.nextInt();
        // сумма
        int sum = SumNum(n);
        // кол-во четных чисел в сумме
        int count = Count(sum);
        System.out.printf("Сумма всех чисел состоящих из нечетных цифр : %d\nКолличество чётных цифр в сумме : %d", sum, count);;

    }
    // сумма всех чисел данного по рядка содержащие нечетные числа
    public static int SumNum(int n){
        int sum = 0;
        for (double i = Math.pow(10, n-1); i < Math.pow(10, n); i++){
            int[] temp = IntToArr((int)i,n);
            if (TestArr(temp, n) == 1){
                sum += i;
            }
        }
        return sum;
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
    // проверка массива на нечётные числа
    public static int TestArr(int[] arr, int n){
        int temp = 1;
        int i = 0;
        while(n-1 > 0){
            n--;
            if (arr[i] % 2 == 0){
                temp = 0;
                break;
            }
            i++;
        }
        return temp;
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
    // подсчёт кол-ва чётных цифр в массиве
    public static int Count(int a){
        int n = DigitsInNumber(a);
        int[] arr = IntToArr(a, n);
        int count = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
