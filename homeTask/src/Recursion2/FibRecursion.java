package Recursion2;

/**
 * Created by Liberstina on 23.02.2015.
 */
//•	Подсчитайте, сколько раз потребуется
// повторно вычислить четвёртый элемент последовательности Фибоначчи для вычисления пятнадцатого элемента.
public class FibRecursion {
    static int amount = 0;

    public static void main(String[] args) {
        int n = 15;
        fib(n);
        System.out.println(amount + " times is required calculate a fourth element");
    }

    static int fib(int n) {
        if (n == 4) {
            amount++;
        }

        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
