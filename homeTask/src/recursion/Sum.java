package recursion;

import java.util.Scanner;
/**
 * Created by Liberstina on 23.02.2015.
 */
public class Sum {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = 1;
        int b = 1;


        int sum = SumOfArrange.sum(a, b, n);
        System.out.println("The sum of the numbers from 1 to " + n + " = " + sum);
    }
}