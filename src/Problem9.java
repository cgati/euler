/**
 * Created by Chris on 1/17/2015.
 */
public class Problem9 {
    public static void main(String[] args) {
        Problem9 problem = new Problem9();
    }

    public Problem9() {
        System.out.print(triplet(1000));
    }

    public long triplet(long s) {
        for (int a = 1; a < s - 2; a++) {
            for (int b = a + 1; b < s - 1; b++) {
                for (int c = b + 1; c < s; c++) {
                    if ((a * a) + (b * b) == (c * c)) {
                        if ((a + b + c) == s) {
                            return a * b * c;
                        }
                    }
                }
            }
        }
        return 0;
    }
}
