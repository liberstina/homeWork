package hw2;

/**
 * Created by Liberstina on 12.02.2015.
 */
//Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
// Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45 (n и m – вводит пользователь).
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ClosestToTen {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter two numbers... ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        String mumber = reader.readLine();
        int n = Integer.parseInt(number);
        int m = Integer.parseInt(mumber);
        int n1 = Math.abs(10 - n);
        int m1 = Math.abs(10 - m);

        if (n1 > m1)
            System.out.println("The closest to ten is - " + m);

        else
            System.out.println("The closest to ten is - " + n);

    }
}
