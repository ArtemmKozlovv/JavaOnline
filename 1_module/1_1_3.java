/*Вычислить значение выражения по формуле (все переменные принимают действительные значения):(𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦) / (𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦) ∗ 𝑡𝑔 𝑥𝑦*/
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num =  new Scanner(System.in);
        // Объявление переменных
        double degrees1,degrees2;
        // Ввод переменных
        System.out.println("Enter x in degrees: ");
        degrees1 = num.nextFloat();
        double x = Math.toRadians(degrees1); // Перевод с градусов в радианы
        System.out.println("enter y in degrees: ");
        degrees2 = num.nextFloat();
        double y = Math.toRadians(degrees2); // Перевод с градусов в радианы
        // Формула
        double result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.println("Result : " + result);
    }
}
