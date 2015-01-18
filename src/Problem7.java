/**
 * Created by Chris on 1/17/2015.
 */
public class Problem7 {
    public static void main(String[] args) {
        Problem7 problem = new Problem7();
    }

    public Problem7() {
        System.out.println(nPrime(10001));
    }

    public int nPrime(int n) {
        int limit = 200000;
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
        int check = 1;
        for (int i = 0; i < limit; i++) {
            if (primes[i]) {
                if (check == n)
                    return i;
                check++;
            }
        }
        return 0;
    }

}
