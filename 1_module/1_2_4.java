package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        // Объявление переменных
        int a, b, x, y, z;
        // Ввод переменных
        System.out.println("Введите размеры отверстия : ");
        System.out.println("A : ");
        a = num.nextInt();
        System.out.println("B : ");
        b = num.nextInt();
        System.out.println("Введите размеры кирпича : ");
        System.out.println("x : ");
        x = num.nextInt();
        System.out.println("y : ");
        y = num.nextInt();
        System.out.println("z : ");
        z = num.nextInt();
        // Алгоритм действий программы
        if((a >=  x && b >= y) || (a >=  y && b >= x) || (a >=  x && b >= z) || (a >=  z && b >= x) || (a >=  y && b >= z) || (a >=  z && b >= y)){
            System.out.println("Кирпич пройдет в отверстие !");
        } else System.out.println("Кирпич не пройдет в отверстие !");
    }
}