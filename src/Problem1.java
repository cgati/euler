/**
 * Created by Chris on 1/17/2015.
 */
public class Problem1 {
    public static void main(String[] args) {
        int value = new Problem1().sum();
        System.out.print(value);
    }

    public int sum() {
        int val = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                val = val + i;
            }
        }
        return val;
    }
}
