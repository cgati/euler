import java.util.ArrayList;

/**
 * Created by Chris on 1/17/2015.
 */
public class Problem3 {
    public static void main(String[] args) {
        new Problem3().factors(600851475143.0);
    }

    public void factors(double n) {
        ArrayList list = new ArrayList();
        double d = 2;
        while (d <= n/d) {
            if (n % d == 0) {
                n = n/d;
                list.add(n);
            } else {
                d = d + 1;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
