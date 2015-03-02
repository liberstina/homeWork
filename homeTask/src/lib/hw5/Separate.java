package lib.hw5;

/**
 * Created by Черничка on 02.03.2015.
 */
import com.sourceit.hometask.basic.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Separate {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FractionNumberOperation fno = new FractionNumberOperation();
        System.out.println("Type the 1st fraction number");
        String s = reader.readLine();
        com.sourceit.hometask.basic.FractionNumber f1 = fno.parseFractionNumber(s);
        System.out.println("Type the 2nd fraction number");
        String ss = reader.readLine();
        com.sourceit.hometask.basic.FractionNumber f2 = fno.parseFractionNumber(ss);
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(fno.add(f1, f2));
        System.out.println(fno.sub(f1, f2));
        System.out.println(fno.div(f1, f2));
        System.out.println(fno.mul(f1, f2));
        //arrays
        FractionNumber[] array = new FractionNumber[6];
        for (int i = 0; i < 6; i++){
            FractionNumber fNumber = new FractionNumber();
            fNumber.setDividend((-100 + (int)(Math.random()*201)));
            fNumber.setDivisor(((int)(Math.random()*101)));
            array[i] = fNumber;
        }

        for (FractionNumber arr : array){
            System.out.print(Objects.toString(arr) + " ");
        }
        System.out.println();
         Arrays.sort(array, new Comparator<FractionNumber>() {
            public int compare(FractionNumber o1,FractionNumber o2) {
                return o1.compareTo(o2);
            }
        });

        for (FractionNumber sort : array){
            System.out.print(Objects.toString(sort) + " ");
            }
        System.out.println();

        for (FractionNumber sort : array){
            System.out.print(sort.doubleValue() + " ");
        }
        System.out.println();
    }
}
