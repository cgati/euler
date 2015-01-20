/**
 * Created by Chris on 1/18/2015.
 */
public class Problem14 {
    public static void main(String[] args) {
        Problem14 problem = new Problem14();
    }

    public Problem14() {
        long max = 0;
        long result = 0;
        for (long i = 1; i < 1000000; i++) {
            long count = collatz(i);
            long oldMax = max;
            max = Math.max(count, max);
            if (max != oldMax) {
                result = i;
            }
        }
        System.out.print(result);
    }

    public long collatz(long n) {
        long count = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (3 * n) + 1;
            }
            count++;
        }
        return count;
    }
}
