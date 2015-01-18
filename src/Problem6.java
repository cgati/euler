/**
 * Created by Chris on 1/17/2015.
 */
public class Problem6 {
    public static void main(String[] args) {
        Problem6 problem = new Problem6();
    }

    public Problem6() {
        System.out.print(squareOfSum(100) - sumOfSquares(100));
    }

    public long sumOfSquares(long n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public long squareOfSum(long n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum * sum;
    }
}
