/**
 * Created by Chris on 1/17/2015.
 */
public class Problem2 {
    public static void main(String[] args) {
        new Problem2().fib();
    }

    public void fib() {
        int v1 = 1;
        int v2 = 2;
        int v3 = 0;

        boolean done = false;
        while (!done) {
            v1 = v1 + v2;
            v2 = v1 + v2;
            if (v1 < 4000000) {
                if (v1 % 2 == 0) {
                    v3+=v1;
                }
                if (v2 % 2 == 0) {
                    v3+=v2;
                }
            } else {
                done = true;
                System.out.print(v3);

            }
        }
    }
}
