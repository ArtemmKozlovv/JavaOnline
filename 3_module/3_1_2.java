package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);
	    // String str = "The word is mine. Interesting word.";
        System.out.println("Введите строку : ");
	    String str = read.nextLine();
	    // Метод replace() — возвращает В Java новую строку,
        // в результате, заменив все вхождения , в данной строке.
        System.out.println("Отредактированная строка : ");
        System.out.println(str.replace("word", "letter"));
    }
}
