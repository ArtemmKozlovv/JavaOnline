/*Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
Поменять местами дробную и целую части числа и вывести полученное значение числа.*/
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num =  new Scanner(System.in);
        System.out.println("Enter number (nnn.ddd): ");
        double number = num.nextFloat();
        int temp = (int)number;
        double temp2 = (int)((number - temp) * 1000);
        double result = temp2 + (double)temp / 1000;
        System.out.println("Result : " + result);
    }
}
