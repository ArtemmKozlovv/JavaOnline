package com.company;

public class Main {

    public static void main(String[] args) {
	int[][] arr = new int[10][20];
	for (int i = 0; i < 10; i++){
	    for (int j = 0; j < 20; j++){
            arr[i][j] = (int)(Math.random() * 16); // случайное число от 0 до 15
        }
    }
	for (int i = 0; i < 10; i++){
	    for (int j = 0; j < 20; j++){
	        System.out.print(arr[i][j] + "\t");
	    }
	    System.out.println();
	}
	System.out.println("Номера строк в которых 5 встречается 3 и более раз : ");
	for (int i = 0; i < 10; i++){
        int temp = 0;
	    for (int j = 0; j < 20; j++){
                if (arr[i][j] == 5) temp++;
	    }
	    if (temp >= 3) System.out.print(i+1 + " ");
	}
    }
}
