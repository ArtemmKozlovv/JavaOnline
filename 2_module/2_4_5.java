package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {4, 42, 12, 53, 53, 65, 0};
	    int befMax = count(arr);
        System.out.println("Второе число по величине в массиве = " + befMax);
    }

    public static int count(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        int befMax = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] != max){
                befMax = array[i];
                break;
            }
        }
        for (int i = 0; i < array.length; i++){
            if (befMax < array[i] && array[i] != max){
                befMax = array[i];
            }
        }
        return befMax;
    }
}
