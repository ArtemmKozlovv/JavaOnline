package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
        System.out.print("Введите первое число : ");
        int a = read.nextInt();
        System.out.print("Введите второе число : ");
        int b = read.nextInt();
        if (CountInt(a) > CountInt(b)){
            System.out.println("Первое число имеет больше цифр.");
        }else if(CountInt(a) < CountInt(b)){
            System.out.println("Второе число имеет больше цифр.");
        }else if(CountInt(a) == CountInt(b)){
            System.out.println("Кол-во цифр в числах равны.");
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
