package lib.hw5;

import com.sourceit.hometask.basic.*;
import com.sourceit.hometask.basic.FractionNumber;

/**
 * Created by Черничка on 02.03.2015.
 */
public class FractionNumberOperation implements com.sourceit.hometask.basic.FractionNumberOperation{

    @Override
    public com.sourceit.hometask.basic.FractionNumber add(com.sourceit.hometask.basic.FractionNumber f1, com.sourceit.hometask.basic.FractionNumber f2) {
        if (f1 == null){
            return f2;
        }
        else if (f2 == null){
            return f1;
        }

        com.sourceit.hometask.basic.FractionNumber result = new lib.hw5.FractionNumber();
        result.setDivisor(f1.getDivisor()*f2.getDivisor());
        result.setDividend(f1.getDividend()*f2.getDivisor()+f2.getDividend()*f1.getDivisor());
        if (result.getDividend()%result.getDivisor() == 0){
            result.setDividend(result.getDividend()/result.getDivisor());
            result.setDivisor(com.sourceit.hometask.basic.FractionNumber.DEFAULT_DIVISOR_VALUE);
            return result;
        }
        return result;
    }

    @Override
    public com.sourceit.hometask.basic.FractionNumber sub(com.sourceit.hometask.basic.FractionNumber f1, com.sourceit.hometask.basic.FractionNumber f2) {

        com.sourceit.hometask.basic.FractionNumber result = new lib.hw5.FractionNumber();

        if (f1 == null){
            result.setDividend(-f2.getDividend());
            result.setDivisor(f2.getDivisor());
            return result;
        }

        if (f2 == null){
            return f1;
        }

        result.setDivisor(f1.getDivisor()*f2.getDivisor());
        result.setDividend(f1.getDividend()*f2.getDivisor()-f2.getDividend()*f1.getDivisor());

        if (result.getDividend()==0){
            return null;
        }

        if (result.getDividend()%result.getDivisor() == 0){
            result.setDividend(result.getDividend()/result.getDivisor());
            result.setDivisor(com.sourceit.hometask.basic.FractionNumber.DEFAULT_DIVISOR_VALUE);
            return result;
        }

        return result;
    }

    @Override
    public com.sourceit.hometask.basic.FractionNumber mul(com.sourceit.hometask.basic.FractionNumber f1, com.sourceit.hometask.basic.FractionNumber f2) {
        if (f1 == null || f2 == null){
            return null;
        }
        com.sourceit.hometask.basic.FractionNumber result = new lib.hw5.FractionNumber();
        result.setDivisor(f1.getDivisor()*f2.getDivisor());
        result.setDividend(f1.getDividend()*f2.getDividend());
        if (result.getDividend()%result.getDivisor() == 0){
            result.setDividend(result.getDividend()/result.getDivisor());
            result.setDivisor(com.sourceit.hometask.basic.FractionNumber.DEFAULT_DIVISOR_VALUE);
            return result;
        }
        return result;
    }

    @Override
    public com.sourceit.hometask.basic.FractionNumber div(com.sourceit.hometask.basic.FractionNumber f1, com.sourceit.hometask.basic.FractionNumber f2) {

        if (f1 == null){
            return null;
        }


        if (f2 == null){
            throw new NullPointerException("Error: the 2nd number cannot be equals to null");
        }


        com.sourceit.hometask.basic.FractionNumber result = new lib.hw5.FractionNumber();
        result.setDivisor(f1.getDivisor()*f2.getDividend());
        result.setDividend(f1.getDividend()*f2.getDivisor());

        if (result.getDividend()%result.getDivisor() == 0){
            result.setDividend(result.getDividend()/result.getDivisor());
            result.setDivisor(com.sourceit.hometask.basic.FractionNumber.DEFAULT_DIVISOR_VALUE);
            return result;
        }

        return result;
    }

    @Override
    public FractionNumber parseFractionNumber(String s) {
        FractionNumber fn = new lib.hw5.FractionNumber();
        int a = s.indexOf('/');
        if (a<0) {
            fn.setDividend(Integer.valueOf(s));
            fn.setDivisor(com.sourceit.hometask.basic.FractionNumber.DEFAULT_DIVISOR_VALUE);
            return fn;
        }
        String str = s.substring(0,a);
        Integer i = Integer.valueOf(str);
        fn.setDividend(i);
        str = s.substring(a+1,s.length());
        i = Integer.valueOf(str);
        fn.setDivisor(i);
        return fn;
    }


}
