import java.util.Scanner;

public class HomeWork {
    //Написать метод, принимающий на вход целое число.
    // Метод должен вывести на экран 2 в степени это Число.
    public static long zweiPow(int inputUser) {
        long zweiPowResult = 1;
        int inputUserNeu = inputUser * 1;
        int j = inputUser >= 0 ? inputUser : inputUser * (-1);

        for (int i = 0; i < j; i++) {
            zweiPowResult *= 2;
        }

        System.out.println("Наша 2 в данной степени равна " +
                ((inputUserNeu >= 0) ? zweiPowResult : (double)1/zweiPowResult));
        return zweiPowResult;
    }
    public static void main(String[] args) {

        zweiPow(-3);
    }
}
