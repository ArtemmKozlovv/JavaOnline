/*Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.*/
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num =  new Scanner(System.in);
        // Объявление переменных
        float z,a,b,c;
        // Ввод переменных
        System.out.println("Enter a: ");
        a = num.nextFloat();
        System.out.println("Enter b: ");
        b = num.nextFloat();
        System.out.println("Enter c: ");
        c = num.nextFloat();
        // Данная функция
        z = ((a-3) * b/2)+c;
        // Вывод результата
        System.out.println("Function value : " + z);
    }
}
