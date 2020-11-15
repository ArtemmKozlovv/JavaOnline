package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Объявление переменных
        int x1, x2, x3, y1, y2, y3;
        // Ввод переменных
        // x1,y1 - координаты точки A ; x2,y2 - координаты точки B ; x3,y3 - координаты точки C ;
        y1 = 0;
        y2 = 1;
        y3 = 2;
        x1 = 0;
        x2 = 1;
        x3 = 2;
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)){
            System.out.println("Через данные три точки можно провести прямую !");
        } else System.out.println("Через данные три точки нельзя провести прямую !");
    }
}