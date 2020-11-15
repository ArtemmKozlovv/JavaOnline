package com.company;

public class Main {

    public static void main(String[] args) {
	    // создание и заполнение массива
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // метод обмена
        int n = 0; // кол-во перестановок
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length-1; j++){
                if (arr[j] < arr[j+1]){ // ЕСЛИ НУЖНО ПО ВОЗРАСТАНИЮ < ПОМЕНЯТЬ НА >
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                    n++;
                }
            }
        }
        // вывод
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
