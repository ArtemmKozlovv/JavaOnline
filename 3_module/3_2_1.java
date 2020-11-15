package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "Без труда  не   выловишь    и     рыбку      из       пруда.";
        System.out.println("Максимальное колличество подряд идущих пробелов в данной строке : " + space(str));
    }
    //подсчёт максимального числа пробелов идущих подряд
    public static int space(String str){
        int maxN = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                int n = 0;
                int j = i;
                while (str.charAt(j) == ' '){
                    n++;
                    j++;
                }
                if(maxN < n){
                    maxN = n;
                }
            }
        }
        return maxN;
    }
}
