package lesson14;
/*Написать метод, принимающий строку и возвращающий новую строку, состоящую из 2го и 3го символа входящей строки,
 переведенных в верхний регистр. Распечатать полученный результат в методе main
 */
public class Task04 {
    public static String neuString(String altStr) {
        if (altStr.length() >= 3) {
            String neuStr = altStr.substring(1,3);
            neuStr = neuStr.toUpperCase();
            return neuStr;
        } else if (altStr.length() >= 2) {
            String neuStr = altStr.substring(1,2);
            neuStr = neuStr.toUpperCase();
            return neuStr;
        } else {
            System.out.println("Маловато символов");
            return "";
        }
    }

    public static void main(String[] args) {
        String sr1 = "bryufhjjj";
        String nowString = neuString(sr1);
        System.out.println(nowString);
    }
}
