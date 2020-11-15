package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num =  new Scanner(System.in);
        // Объявление переменных
        int a, b;
        // Ввод переменных
        System.out.println("Enter first angle: ");
        a = num.nextInt();
        System.out.println("Enter second angle: ");
        b = num.nextInt();
        if (180 - a - b > 0){
            if (a == 90 || b == 90 || a + b  == 90) System.out.println("Треугольник с данными углами существует и он прямоугольный !");
                else System.out.println("Треугольник с данными углами существует, но он непрямоугольный !");
        }
            else System.out.println("Треугольника с указанными углами не существует ! ");
    }
}
