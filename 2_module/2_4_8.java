package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
        System.out.print("Введите номер от которого начинается последовательность. k = ");
        int k = read.nextInt();
        System.out.print("Введите номер до которого длится последовательность. m = ");
        int m = read.nextInt();

        test(k, m);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        count(arr, k, m);
    }

    public static void count(int[] array, int k, int m){
        /*int temp = k - 1;
        for (int j = 0; j < (m - k) / 3 + 1; j++) {
            int id = 1;
            for (int i = temp; i < m; i++) {
                if (i + 3 < m) {
                    System.out.print(id + ") сумма = ");
                    sum(array, i);
                    id++;
                    break;
                } else if (i + 3 == m) {
                    System.out.print(id + ") сумма = ");
                    sum(array, i - 1);
                    id++;
                    break;
                } else if (i + 3 == m + 1) {
                    System.out.print(id + ") сумма = ");
                    sum(array, i - 2);
                    id++;
                    break;
                }
            }
        }*/
        int temp = k - 1;
        int n = (int)((m - k) / 3 + 1.99); // кол-во сумм
        for (int i = 0; i < n; i++){
            System.out.print("Sum " + (i+1) + ") ");
            if (temp + 3 < m){
                sum(array, temp);
                temp += 2;
            }else if (temp + 2 <= m){
                sum(array, temp-1);
                temp += 2;
            }
        }
    }
    //сумма последовательных числа в массиве начиная с i-ого
    public static void sum(int[] array, int i){
        int sum = 0;
        for (int k = i; k < i + 3; k++){
            sum += array[k];
        }
        System.out.println(sum);
    }

    public static void test(int k, int m){
        if (k == m){
            System.out.println("Номера начального и конечного элемента совпадают. Суммы не будет !");
            System.exit(0);
        }
    }
}