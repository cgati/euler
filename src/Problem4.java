/**
 * Created by Chris on 1/17/2015.
 */
public class Problem4 {
    public static void main(String[] args) {
        Problem4 problem = new Problem4();
    }

    public Problem4() {
        int max = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                if (isPalindromic(i * j)) {
                    max = Math.max(max, i * j);
                }
            }
        }
        System.out.println(max);
    }

    public boolean isPalindromic(int n) {
        String number = Integer.toString(n);
        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
