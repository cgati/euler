/**
 * Created by Chris on 1/18/2015.
 */
public class BigInt {
    public static void main(String[] args) {

    }

    public BigInt() {
    }

    public String Add(String op1, String op2) {
        int length1 = op1.length();
        int length2 = op2.length();

        if (length1 != length2) {
            int diff = length1 - length2;
            diff = Math.abs(diff);
            String prepend = "";
            for (int i = 0; i < diff; i++) {
                prepend = "0" + prepend;
            }
            if (length1 < length2) {
                op1 = "0" + prepend + op1;
                op2 = "0" + op2;
            } else {
                op2 = "0" + prepend + op2;
                op1 = "0" + op1;
            }
        } else {
            op1 = "0" + op1;
            op2 = "0" + op2;
        }
        String result = "";
        for (int i = 0; i < op1.length(); i++) {
            result = "0" + result;
        }
        int carry = 0;
        for (int i = op1.length() - 1; i >= 0; i--) {
            int a = Integer.parseInt(String.valueOf(op1.charAt(i)));
            int b = Integer.parseInt(String.valueOf(op2.charAt(i)));
            // need to implement carry
            result = result.substring(0, i) + String.valueOf((a + b + carry) % 10) + result.substring(i + 1);
            if (a + b + carry > 9) {
                carry = 1;
            } else {
                carry = 0;
            }
        }
        result = trimLeadingZeroes(result);
        return result;
    }

    public String trimLeadingZeroes(String s) {
        while (s.startsWith("0")) {
            s = s.substring(1);
        }
        return s;
    }
}
