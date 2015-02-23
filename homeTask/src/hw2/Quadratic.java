package hw2;

/**
 * Created by Liberstina on 13.02.2015.
 */
//В три переменные a, b и c записаны три вещественных числа.
// Создать программу, которая будет находить и выводить на экран вещественные корни квадратного уравнения ax^2+bx+c=0,
// либо сообщать, что корней нет (a, b и c – вводит пользователь).

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Quadratic {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter three numbers ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String One = reader.readLine();
        String Two = reader.readLine();
        String Three = reader.readLine();
        double a = Integer.parseInt(One);
        double b = Integer.parseInt(Two);
        double c = Integer.parseInt(Three);
        double d, x1, x2;
        d = (b * b) - (4 * a * c);
        if (d>0) {
            x1 = ((-1) * b + Math.sqrt(d)) / (2 * a);
            x2 = ((-1) * b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        }
        else if (d == 0) {
            x1 = (-1)*b/2 * a;
            System.out.println("x1 = x2 = " + x1);
        }
        else
            System.out.println("There is no decisions.");
    }
}
