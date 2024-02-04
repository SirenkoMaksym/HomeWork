package lesson14;

public class Task05 {

//Реализуйте метод sumOfArray (сумма элементов массива),
// который получает на вход массив и определяет сумму его элементов.
    public static int sumOfArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i]+ sum;
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {

        int[] array = {1};
        int result = sumOfArray(array);
        System.out.println("Сумма элементов массива: " + result);

    }
}
