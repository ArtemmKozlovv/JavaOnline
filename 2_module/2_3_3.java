package com.company;

public class Main {

    public static void main(String[] args) {
	    // создание и заполнение массива
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //сортировка выбором
        for (int i = 0; i < arr.length; i++){
            // нахождение наибольшего элемента и его порядкового номера в массиве начиная с i-ого элемента
            int max = arr[i];
            int maxId = i;
            for (int j = i; j < arr.length; j++) {
                if (max < arr[j]){
                    max = arr[j];
                    maxId = j;
                }
            }
            // замена i-ого элемента на максимальный
            int temp = arr[i];
            arr[i] = max;
            arr[maxId] = temp;
            // вывод
            System.out.print(arr[i] + " ");
        }
    }
}
