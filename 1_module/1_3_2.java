package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = read.nextInt();
        System.out.print("Input b: ");
        int b = read.nextInt();
        System.out.print("Input step h: ");
        int h = read.nextInt();

        for (int x = a; x <= b; x += h) {
            if (x > 2) {
                System.out.println(x);
            } else System.out.println(-x);
        }
    }
}
