/*Вычислить значение выражения по формуле (все переменные принимают действительные значения): (𝑏 + √(𝑏^2 + 4𝑎𝑐)) / 2𝑎 − 𝑎^3𝑐 + 𝑏^−2*/
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num =  new Scanner(System.in);
        // Объявление переменных
        double z,a,b,c;
        // Ввод переменных
        System.out.println("Enter a: ");
        a = num.nextFloat();
        System.out.println("Enter b: ");
        b = num.nextFloat();
        System.out.println("Enter c: ");
        c = num.nextFloat();
        // Проверка на ноль в знаменателе
        if (a == 0 || b == 0) System.out.println("Error : the denominator is zero"); // Вывод ошибки
        else {
            // Функция
            z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
            // Вывод ответа
            System.out.println("Function value : " + z);
        }
    }
}
