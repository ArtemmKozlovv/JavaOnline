package com.company;

public class Main {

    public static void main(String[]args){

        String str = "I have 22 brothers , 121 sisters, and 32 apples :D";

        int n = 0; // кол-во чисел в строке
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) { // Character.isDigit - проверка является ли элемент числом
                n++;
                i = TheEndNum(i, str);
            }
        }
        System.out.println("Колличество чисел в строке : " + n);
    }


    public static int TheEndNum(int i, String str) {
        while (Character.isDigit(str.charAt(i+1))){ // Character.isDigit - проверка является ли элемент числом
            i+=1;
        }
        return i; // возвращаем индекс последней цифры в числе
    }
}

