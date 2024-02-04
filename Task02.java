package lesson14;

public class Task02 {
/*
    Написать метод, принимающий строку и один или два индекса (перегрузка). Метод должен возвращать
    подстроку начиная с первого индекса (включительно) и заканчивая вторым индексом (не включительно)
    Если индекс 1 - начиная с индекса и до конца строки.

 */
    public static String fromIndexToSekondIndex(String input, int index1){
        if (index1 <0 || index1>=input.length()){
            System.out.println("Такого индекса не существует");
            return "";
        }
        String neuStroka = "";
        for (int i = index1; i <input.length() ; i++) {
            neuStroka = neuStroka + input.charAt(i);
        }
        return neuStroka;
    }
    public static String fromIndexToSekondIndex(String input, int index1, int index2){
        if (index1 <0 ||  index1>index2 || index2 >=input.length()){
            System.out.println("Перепроверьте введенные индексы!");
            return "";
        }
        String neuStroka = "";
        for (int i = index1; i <index2 ; i++) {
            neuStroka = neuStroka + input.charAt(i);
        }
        return neuStroka;
    }


    public static void main(String[] args) {
        String oldStroka = "0123456789";
        fromIndexToSekondIndex(oldStroka, 2,5);
        System.out.println(fromIndexToSekondIndex(oldStroka, 23));
        System.out.println(fromIndexToSekondIndex(oldStroka, 3, 11));


    }
}
