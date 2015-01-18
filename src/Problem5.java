/**
 * Created by Chris on 1/17/2015.
 */
public class Problem5 {
    public static void main(String[] args) {
        Problem5 problem = new Problem5();
    }

    public Problem5() {
        long i = 1;
        while (true) {
            if (isDivisible(i)) {
                break;
            }
            i++;
        }
        System.out.print(i);
    }

    public boolean isDivisible(long n) {
        for (long i = 2; i < 21; i++) {
            if (n % i != 0) {
                return false;
            }
        }
        return true;
    }
}
