package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
        System.out.println("Введите строку : ");
	    String str = read.nextLine();

	    int n = 0;
        for (int i =0; i < str.length(); i++){
            if(TestNum(str.charAt(i)) == 1){
                n++;
            }
        }

        System.out.print("Колличество цифр в строке : " + n);
    }
    // проверка является ли элемент числом
    public static int TestNum(char a){
        if (a == '0' || a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9'){
            return 1;
        }
        return 0;
    }
}
