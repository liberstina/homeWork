package hw2;

/**
 * Created by Liberstina on 12.02.2015.
 */
//Создать программу, проверяющую и сообщающую на экран, является ли целое число, записанное в переменную n,
// чётным либо нечётным (n – вводит пользователь).

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvenNumbers {

    public static void main(String[] args) throws Exception {
        System.out.println("Enter the number ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String Number = reader.readLine();
        int n = Integer.parseInt(Number);
        if ((n % 2) == 0) {
            System.out.println("The number " + n + " is even ");
        } else {
            if ((n % 1) == 0) {
                System.out.println("Число " + n + " isn't even ");
            }

        }
    }
}

