package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num =  new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = num.nextInt(); // Ввод кооординаты точки по оси Ox
        System.out.println("Enter y: ");
        int y = num.nextInt(); // Ввод кооординаты точки по оси Oy
        if ((y >= -3 && y <= 0 && x >= -4 && x <= 4) || (y >= 0 && y<=4 && x >= -2 && x <= 2) ){
            System.out.println("true");
        } else System.out.println("false");
    }
}
