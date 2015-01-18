import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Chris on 1/17/2015.
 */
public class Problem12 {
    public static void main(String[] args) {
        Problem12 problem = new Problem12();
    }

    public Problem12() {
        for (long i = 0; ; i++) {
            long triangle = triangleNumber(i);
            long val = numDivisors(triangle);
            if (val > 500) {
                System.out.print(triangle);
                break;
            }
        }
    }

    public long triangleNumber(long n) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    public int numDivisors(long n) {
        long d = 2;
        int count;
        int val = 1;
        while (d <= n) {
            if (n % d == 0) {
                count = 0;
                while (n % d == 0) {
                    count++;
                    n = n / d;
                }
                val = val * (count + 1);
            }
            d++;
        }
        return val;
    }
}
