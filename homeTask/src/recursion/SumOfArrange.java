package recursion;

/**
 * Created by Liberstina on 23.02.2015.
 */

//•	Написать метод, который для данного числа n (заданного с клавиатуры) вычисляет сумму чисел от 1 до n;

public class SumOfArrange {
    public static int sum(int a, int b, int n) {
        int sum = a;
        if (n == 1) {
            return a;
        } else {
            return sum + sum(a + b, b, n - 1);
        }
    }
}
