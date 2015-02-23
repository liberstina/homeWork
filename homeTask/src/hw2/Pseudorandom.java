package hw2;

/**
 * Created by Liberstina on 12.02.2015.
 */
//Натуральное положительное число записано в переменную n.
// Создайте программу, которая будет генерировать и выводить на экран целое псевдослучайное число
// из отрезка [-n;n] (n – вводит пользователь).

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Pseudorandom {
    public static void main(String [] args) throws Exception {
        System.out.println("Enter the number ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String Number = reader.readLine();
        int n = Integer.parseInt(Number);
        System.out.println( (int)(Math.random()*(2*n)+1) - n);
    }

}
