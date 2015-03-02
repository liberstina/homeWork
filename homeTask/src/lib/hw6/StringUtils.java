package lib.hw6;

/**
 * Created by Liberstina on 02.03.2015.
 */

import com.sourceit.hometask.exceptions.CustomException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringUtils implements com.sourceit.hometask.exceptions.StringUtils {
    @Override
    public double div(String s, String s1) throws NullPointerException, NumberFormatException, ArithmeticException {
        double ss = (Double.parseDouble(s));
        double ss1 = (Double.parseDouble(s1));
        if (ss1 == 0) throw new ArithmeticException("Error: divisor equals to null");
        return ss / ss1;

    }

    @Override
    public int[] findWord(String s, String s1) throws NullPointerException {
        //i'm not sure that i understood this correct but... don't laugh please
        String zero = "null";
        if (zero.equals(s)) throw new NullPointerException("Error: the 1st number equals to null");
        if (zero.equals(s1)) throw new NullPointerException("Error: the 2nd number equals to null");
        ArrayList arrInt = new ArrayList<Integer>();

        String keyword = "Ukraine";
        Boolean found = Arrays.asList(s.split(" ")).contains(keyword);
        if (found) throw new NullPointerException("Error: there is no matching words");
        {
            int[] mas = new int[(arrInt.toArray()).length];
            for (int i = 0; i < mas.length; i++) {
                mas[i] = (int) ((arrInt.toArray())[i]);
            }
            return mas;

            }
        }

        @Override
        public double[] findNumbers(String s) throws CustomException {
            //i cannot get what this method should do
            return new double[0];
        }

    }



