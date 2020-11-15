package com.company;
import java.math.*; // подключаем пакет для использования типа BigInteger

public class Main {

    public static void main(String[] args) {
        BigInteger comp = BigInteger.valueOf(1);    // переменная типа BigInteger, т.к. искомое нами
                                                    // число слишком большое для типа long или double
        for (int i = 1; i <= 200; i++){ // составляем цикл
            BigInteger temp; // создаем вспомогающую переменную типа BigInteger для взаимодействия с переменной comp
            double temp1 = Math.pow((double)i, 2); // создаем вторую вспомогательную перменную тип int для возведения в квадрат
            temp = BigInteger.valueOf((int)temp1); // переведим с типы int в BigInteger
            comp = comp.multiply(temp); // производим умножение
        }

        System.out.println("Произведение всех квадратов чисел от 1 до 200 = " + comp); // выводим ответ
    }
}
