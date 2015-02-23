package Arrays;
/**
 * Created by Liberstina on 17.02.2015.
 */
//Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
// Вывести массив на экран.

public class FirstArray {
    public static void main(String[] args) {

        int[][] Array = new int[8][5];
        for(int n = 0; n < Array.length; n++){
            for(int m = 0; m < Array[n].length; m++){
                Array[n][m]=(int)(Math.random()*90) + 10;
                System.out.print(Array[n][m]+ " ");
            }
            System.out.println(" ");
        }
    }
}