package lib.hw6;

/**
 * Created by Liberstina on 02.03.2015.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class RunningClass {

public static void main(String[] args) throws IOException {
    System.out.println("Enter two numbers");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s = reader.readLine();
    String s1 = reader.readLine();

    StringUtils stringUtils = new StringUtils();
        try {
            System.out.println(stringUtils.div(s, s1));
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        } catch (NumberFormatException n) {
            System.out.println("Your enter incorrect symbols instead of numbers");
        } catch (ArithmeticException n) {
            System.out.println(n.getMessage());
        }

    }

}
