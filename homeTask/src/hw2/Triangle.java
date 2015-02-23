package hw2;

/**
 * Created by Liberstina on 13.02.2015.
 */

//В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
// Вычислить и вывести на экран площадь треугольника и его периметр (a и b – вводит пользователь).

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Triangle {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter two numbers ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String Katet1 = reader.readLine();
        String Katet2 = reader.readLine();
        double a = Integer.parseInt(Katet1);
        double b = Integer.parseInt(Katet2);

        double square = (0.5 * a * b);
        double perimeter = (a + b + Math.sqrt(a*a + b*b));

        System.out.println("The sq. of a triangle is equal to " + square + ". And perimeter is equal to " + perimeter);
    }
}
