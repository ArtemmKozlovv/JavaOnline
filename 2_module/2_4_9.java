package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Введите сторону 'X' в четырех угольнике : ");
        int x = read.nextInt();
        System.out.print("Введите сторону 'Y' в четырех угольнике : ");
        int y = read.nextInt();
        System.out.print("Введите сторону 'Z' в четырех угольнике : ");
        int z = read.nextInt();
        System.out.print("Введите сторону 'T' в четырех угольнике : ");
        int t = read.nextInt();
        Square(x, y, z, t);
    }

    public static void Square(int x, int y, int z, int t){
        double d = PythagoreanTheorem(x, y); // Диагональ напротив прямого угла, нашли по теореме Пифагора
        double s1=x*y*0.5; //Первая часть площади четырехугольника
        double s2=0.25*Math.sqrt((d+z+t)*(d+z-t)*(d+t-z)*(z+t-d));//Вторая часть площади четырехугольника, найдено по формуле Герона
        double s = s1 + s2; // общая площадь
        System.out.printf("Площадь четырёх угольника с указанными сторонами равна = %.2f", s);
    }

    public static double PythagoreanTheorem(int x, int y){
        return Math.sqrt(x*x+y*y);
    }

}
