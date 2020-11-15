package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
        System.out.print("Введите кол-во точек на плоскости : ");
        int n = read.nextInt();

        // заполнение информации о точках на плоскости
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++){
            System.out.printf("Введите кординаты точки #%d : ", i + 1);
            System.out.println();
            for (int j = 0; j < 2; j++){
                if (j == 0) {
                    System.out.print("\tX = ");
                    arr[i][j] = read.nextInt();
                }
                else{
                    System.out.print("\tY = ");
                    arr[i][j] = read.nextInt();
                }
            }
        }
        System.out.println("Введите номера двух точек между которыми будет высчитано расстояние :");
        System.out.print("\tПервая точка : ");
        int a = read.nextInt();
        System.out.print("\tВторая точка : ");
        int b = read.nextInt();
        double distance = distance(arr[a-1][0], arr[a-1][1], arr[b-1][0], arr[b-1][1]);
        System.out.printf("Расстояние от точки %d до %d = %.2f",a ,b, distance);
    }

    public static double distance(int x1, int y1, int x2, int y2){
        double temp = 0;
        if (x1 == x2){
            temp = Math.abs(y1-y2);
        }
        else if (y1 == y2){
            temp = Math.abs(x1-x2);
        }
        else{
            temp = Math.sqrt(Math.pow(y1-y2, 2) + Math.pow(x1-x2, 2));
        }
        return temp;
    }
}
