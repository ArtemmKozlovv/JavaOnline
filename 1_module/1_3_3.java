package com.company;

public class Main {

    public static void main(String[] args) {
        double sum = 0f; // переменная для искомой нам суммы
	    for (int i = 1; i <= 100; i++){ // цикл переберающий числа от 1 до 100
	        sum += Math.pow(i,2); // переменная в которую будет записан квадрат числа
        }
        System.out.printf("Сумма равна %d \n", (int)sum); // вывод ответа
    }
}
