package com.company;
import java.util.Scanner;
//1234
public class Main {

    public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
        System.out.print("Введите порядок чисел : ");
        int n = read.nextInt();
        Method(n);
    }

    public static void Method(int n){
        for (double i = Math.pow(10, n-1); i < Math.pow(10, n); i++){
            int[] temp = IntToArr((int)i,n);
            if (TestArr(temp, n) == 1){
                System.out.print((int)i + " ");
            }
        }
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
    // проверка массива на возрастание
    public static int TestArr(int[] arr, int n){
        int temp = 1;
        int i = 0;
        while(n-1 > 0){
            n--;
            if (arr[i] >= arr[i + 1]){
                temp = 0;
                break;
            }
            i++;
        }
        return temp;
    }
}
