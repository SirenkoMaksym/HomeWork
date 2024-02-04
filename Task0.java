package lesson14;

import java.sql.SQLOutput;

/*Написать метод переводящие все маленькие буквы латинского алфавита в строке в верхний регистр.
toUpperCase() использовать низзя.*/
public class Task0 {

    public static String fromlittleToBig(String inputLittle){
        String bigStr = "";

        for (int i = 0; i < inputLittle.length()-1; i++) {
        char  neuStr =inputLittle.charAt(i);
            if (neuStr >= 'a' && neuStr<= 'z') {
                char bigLitera = (char)(neuStr-32);
                bigStr += bigLitera;
            }else{
                bigStr += neuStr;
            }

        }
        System.out.println(bigStr);
        return bigStr;


    }

    public static void main(String[] args) {
        fromlittleToBig("ty ftftb fy");

    }
}
