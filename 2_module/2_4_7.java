package com.company;

public class Main {

    public static void main(String[] args) {
        // данный массив
	    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(SumArr(ArrayToFacArray(FindingOddNumbers(arr))));
    }

    // подсчёт кол-ва нечетных чисел в массиве
    public static int AmountOddNumbers(int[] array){
        int n = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 1){
                n++;
            }
        }
        return n;
    }
    // вывод нечетных чисел массива в другом массиве
    public static int[] FindingOddNumbers(int[] array){
        int[] newArr = new int[AmountOddNumbers(array)];
        int temp = 0;
        for (int i = 0; i < newArr.length; i++){
            for (int j = temp; j < array.length; j++){
                if (array[j] % 2 == 1){
                    newArr[i] = array[j];
                    temp = j + 1;
                    break;
                }
            }
        }
        return newArr;


    }
    // факториал
    public static int factorial(int a){
        int factorial = 1;
        for (int i = 1; i < a+1; i++){
            factorial *= i;
        }
        return factorial;
    }
    // заменна элементов массива на их факториал (возвращает массив)
    public static int[] ArrayToFacArray(int [] array){
        for (int i = 0; i < array.length; i++){
            array[i] = factorial(array[i]);
        }
        return array;
    }
    // сумма всех эллементов массива
    public static int SumArr(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
