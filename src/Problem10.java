/**
 * Created by Chris on 1/17/2015.
 */
public class Problem10 {
    public static void main(String[] args) {
        Problem10 problem = new Problem10();
    }

    public Problem10() {
        System.out.print(sumPrime(2000000));
    }

    public long sumPrime(int limit) {
        boolean[] primes = new boolean[limit];
        primes[0] = primes[1] = false;

        for (int i = 2; i < limit; i++) {
            primes[i] = true;
        }

        for (int i = 2; i*i < limit; i++) {
            if (primes[i]) {
                for (int j = i; i*j < limit; j++) {
                    primes[i*j] = false;
                }
            }
        }

        long sum = 0;
        for (int i = 2; i < limit; i++) {
            if (primes[i]) {
                sum += i;
            }
        }
        return sum;
    }
}
