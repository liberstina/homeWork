package lib.hw5;

/**
 * Created by Черничка on 02.03.2015.
 */
public class FractionNumber implements com.sourceit.hometask.basic.FractionNumber {
    int dividend;
    int divisor;

    @Override
    public void setDividend(int i) {
    dividend = i;
    }

    @Override
    public int getDividend() {
        return dividend;
    }

    @Override
    public void setDivisor(int j) {
    divisor = j;
    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public double doubleValue() {
        return (double) (dividend/divisor);
    }

    @Override
    public String toString() {
        String s = getDividend() + "/" + getDivisor();
        return s;
    }

    @Override
    public int compareTo(com.sourceit.hometask.basic.FractionNumber o) {
        if(doubleValue() > o.doubleValue()){
            return 1;
        }
        else if(doubleValue()== o.doubleValue()){
            return 0;
        }
        else if(doubleValue() < o.doubleValue()){
            return -1;
        }
       else return 0;
    }
}
