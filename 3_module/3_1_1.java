package com.company;

public class Main {

    public static void main(String[] args) {
	//char[] f = {'f'};
	//String str = new String(f, 0, 1);
    //    String str = "HELLO";
        //   char[] str1 = str.toCharArray();

        String[] str = {"camelCase", "caseCamel", "helloWorld", "homeWork"};
        for (int i = 0; i < str.length; i++){
            char[] arr = str[i].toCharArray();
            int n = arr.length + 1 ;
            char[] temp = new char[n];
            int id = 0; // номер элемента в массиве 'arr' с заглавной буквой
            // поиск заглавной буквы
            for (int j = 0; j < arr.length; j++){
                if (Character.isUpperCase(arr[j])){
                    id = j;
                }
            }
            // замена
            for (int j = 0; j < temp.length; j++){
                int k = 0;
                if (j < id){
                    temp[j] = arr[j];
                }else if (j == id){
                    temp[j] = '_';
                    temp[j + 1] = Character.toLowerCase(arr[j]);
                    j = j + 1;
                }else if(j > id){
                    temp[j] = arr[j - 1];
                }
            }
            // вывод
            for (int j = 0; j < temp.length; j++){
                System.out.print(temp[j]);
            }
            System.out.println();
        }
    }
}
