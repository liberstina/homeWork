package hw2;

/**
 * Created by Liberstina on 13.02.2015.
 */
//Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155]
//целое число в интервал (25;100) и сообщать результат на экран.


public class FallWithinARange {
    public static void main(String [] args) throws Exception {
        int rnd = 5 + (int)(Math.random() * ((155 - 5) + 1));

        if (rnd < 100 && rnd > 25) {
            System.out.println("The number " + rnd + " falls within a range from 25 to 100");
        }
        else
            System.out.println("The number " + rnd + "doesn't fall within a range from 25 to 100");
    }
}
