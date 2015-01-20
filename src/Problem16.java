import java.math.BigInteger;

/**
 * Created by Chris on 1/19/2015.
 */
public class Problem16 {
    public static void main(String[] args) {
        Problem16 problem = new Problem16();
    }

    public Problem16() {
        bigPow(1000);
    }

    public void bigPow(int n) {
        double sum = 0;

        BigInteger bigInt = new BigInteger("2").pow(n);
        BigInteger bigTen = new BigInteger("10");

        while (bigInt.doubleValue() > 0) {
            sum = sum + bigInt.mod(bigTen).intValue();
            bigInt = bigInt.divide(bigTen);
        }

        System.out.print(sum);
    }
}
