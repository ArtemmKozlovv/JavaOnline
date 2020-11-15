package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "aaaaaaaaaaaaaaaaaaaaaaaaa";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'){
                str = EnterB(str, i);
            }
        }
        System.out.println("Полученная строка : " + str);
    }
    // вставка символа 'b' в строку
    public static String EnterB(String str, int i){
        StringBuffer str1 = new StringBuffer(str);
        str1.insert(i + 1, 'b');
        str = new String(str1);
        return str;
    }
}
