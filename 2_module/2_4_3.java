package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
        System.out.print("Введите длинну стороны правильного шестиугольника : ");
        double a = read.nextDouble();
        double square = square(a)*6;
        System.out.println("Площадь правильного шестиугольника = " + square);
    }

    // метод вычисления площади треугольника
    public static double square(double a){
        return Math.sqrt(3)*Math.pow(a, 2) / 4;
    }
}
