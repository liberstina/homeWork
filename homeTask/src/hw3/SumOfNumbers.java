package hw3;
import java.util.Scanner;

public class SumOfNumbers {

    /**
     * Created by Liberstina on 16.02.2015.
     */
//Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
// (заранее не известно сколько цифр будет в числе).

        public static void main(String[] args) {
            int sum = 0;
            System.out.println("Enter the number ");
            Scanner sn = new Scanner(System.in);
            int i = sn.nextInt();
            while (i != 0) {
                sum = sum + (i % 10);
                i = i / 10;
            }
            System.out.println("The sum of numbers is " + sum);

        }
    }
