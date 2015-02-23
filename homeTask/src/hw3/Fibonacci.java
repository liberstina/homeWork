package hw3;
/**
 * Created by Liberstina on 16.02.2015.
 */
//Выведите на экран первые 11 членов последовательности Фибоначчи.
// Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
public class Fibonacci {
    public static void main(String[] args) {
        int i = 1, j = 1;
        System.out.print(i + " " + j + " ");
        for (int n = 1; n < 10; n++){
            int z = i + j;
            i = j;
            j = z;
            System.out.print(z + " ");


        }
    }
}
