package hw2;

/**
 * Created by Liberstina on 13.02.2015.
 */
//Создать программу, выводящую на экран случайно сгенерированное трёхзначное
// натуральное число и его наибольшую цифру.

public class ThreeDigits {
    public static void main(String[] args)
    {
        int i = (int)(Math.random()*900 + 99);
        int a = i%10;
        int b = (i/10)%10;
        int c = (i/100)%10;
        if (a >= b && a > c || a > b && a >= c){
            System.out.println("In the number " + i + " the biggest digit is - " + a);
        }
        else {
            if (b > a && b >= c){
                System.out.println("In the number " + i + " the biggest digit is - " + b);

            }
            else
            {
                System.out.println("In the number " + i + " the biggest digit is - " + c);

            }
        }

    }
}


