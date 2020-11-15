/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.*/
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num =  new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = num.nextInt();
        int h,m,s; // часы, минуты, секунды
        h = number / 3600;
        m = (number - 3600 * h) / 60 ;
        s = number - 3600 * h - 60 * m;
        System.out.println("HH" + h + " MM" + m + " SS" + s);
    }
}
