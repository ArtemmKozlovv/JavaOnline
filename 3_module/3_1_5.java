package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "      Без   труда  не     выловишь     и        рыбку           из пруда.      ";
        //удаляем пробелы с конца и начала строки с помощью trim()
        str = str.trim();
        // удаляем пробелы которые удут подрят с помощью delete()
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == ' ' && str.charAt(i+1) == ' '){
                    StringBuffer str1 = new StringBuffer(str);
                    str1.delete(i, i+1);
                    str = new String(str1);
                }
            }
        }
        System.out.println("Введенная строка, где удалены лишние пробелы : " + str);
    }
}
