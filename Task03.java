package lesson14;

import java.util.Objects;

/*
Написать метод по поиску строки в массиве строк. На вход метод принимает массив строк, и строку для поиска.
 */
public class Task03 {


    public static void suchStr(String[] array, String such){


        int j = 0;
        if (Objects.equals(array[j], such)){
            System.out.println("Строка в масиве под номером 0!");
            return ;
        }

        for (int i = 1; i < array.length; i++) {
            if (Objects.equals(array[i], such)){
                j = i;
            }
        }

            System.out.println( (j !=0) ? "Строка в массиве под номером  " + j : "Значение не найдено");
    }

    public static void main(String[] args) {

        String[] str1 = {"One", "Two", "Three", "vier", "Funf"};
        String s1 = "vier";
        suchStr(str1, s1);

    }
}
