package com.company;

public class Main {

    public static void main(String[] args) {
        // создание двух неубывающих последовательностей
        int[] arr = {1, 6, 9, 23, 24, 33, 44}; // первая
        int[] arr1 = {1, 4, 8, 12, 22, 100}; // вторая
        int temp = 0; // вспомогательная перменная
        int stop = 0; // перменная запоминающая индекс числа на котором остановились в цикле
        for (int i = 0; i < arr.length; i++){
            for (int j = stop; j < arr1.length; j++){
                if(arr[i] > arr1[j]){
                    System.out.print(arr1[j] + " ");
                    temp++;
                    stop = j+1;
                }
            }
            System.out.print(arr[i] + " ");
        }
        // вывод оставшихся чисел во второй матрице
        if (temp != arr1.length-1){
            for (int i = temp; i < arr1.length; i++){
                System.out.print(arr1[i] + " ");
            }
        }
        System.out.println();
    }
}
