package lesson14;
/*Task 1
Написать метод swap, принимающий на вход массив целых чисел, и два индекса.
 Метод должен поменять местами значения, хранящихся в этих индексах

{0, 1, 2, 3, 4, 5, 6} -> swap(arr, 1, 5} -> {0, 5, 2, 3, 4, 1, 6}
Если индексы за пределами массива?
Перегрузка метода для работы с массивами строк.*/

public class Task01 {

    public static void swap(String[] array, int index1, int index2 ){
        if (index2 >= 0 && index1 >= 0 && index1 <array.length && index2 < array.length){
            String j = array[index1];
            String k = array[index2];
            array[index1] = k;
            array[index2] = j;
        } else {
            System.out.println("Такого индекса не существует!");
        }
    }

    public static void swap(int[] array, int index1, int index2){
        if (index2 >= 0 && index1 >= 0 && index1 <array.length && index2 < array.length){
            int j = array[index1];
            int k = array[index2];
            array[index1] = k;
            array[index2] = j;
        } else {
            System.out.println("Такого индекса не существует!");
        }
    }

    public static void main(String[] args) {

        int[] x = {32,45,55,6,7,8,9};
        swap(x,0,2);

        String[] strArr = {"Удалить", ",", "нельзя", "восстановить" };
        swap(strArr, 1,2);
    }
}
