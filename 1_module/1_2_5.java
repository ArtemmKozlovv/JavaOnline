package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    double x;
    System.out.println("Введите переменную x : ");
    x = num.nextDouble();
    if (x <= 3) System.out.println(Math.pow(x,2) - 3 * x + 9);
    else System.out.println(1 / (Math.pow(x,3) + 6));
    }
}
