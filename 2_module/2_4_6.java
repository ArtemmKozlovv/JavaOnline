package com.company;

public class Main {

    public static void main(String[] args) {
	    // Данные числа
        int a = 10;
        int b = 0;
        int c = 11;

        if (PrimeNumber(a, b, c) == 1){
            System.out.println("Числа взаимно простые !");
        }else {
            System.out.println("Данные числа не взаимно простые !");
        }
    }
    // првоерка на взаимопростые числа
    public static int PrimeNumber(int a, int b, int c){
        int ans = 1;
        int temp = LargestNumber(a, b, c);
        // цикл проверяющий взаимно простые числа или нет
        for (int i = temp; i > 1; i--){
            if (a % i == 0 && b % i == 0 || a % i == 0 && c % i == 0 || b % i == 0 && c % i == 0){
                System.out.println(i);
                ans = 0;
            }
        }

        return ans;
    }
    // поиск наибольшего числа из трёх
    public static int LargestNumber(int a, int b, int c){
        int temp;
        if (a >= b && a >= c){
            temp = a;
        }else if (b > c){
            temp = b;
        }else{
            temp = c;
        }
        return temp;
    }
}
