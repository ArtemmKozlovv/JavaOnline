package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "Доход";
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            String s = String.valueOf(str.charAt(i));
            str2 += s;
        }
        if (str.equalsIgnoreCase(str2)){
            System.out.println("Слово является палиндромом !");
        }else {
            System.out.println("Слово не является палиндромом !");
        }
    }
}
