/**
 * Created by Chris on 1/19/2015.
 */
public class Problem17 {
    int ONE = 3;
    int HUNDRED = 7;
    int THOUSAND = 8;
    int AND = 3;

    int[] ones = {3, 3, 5, 4, 4, 3, 5, 5, 4};
    int[] teens = {6, 6, 8, 8, 7, 7, 9, 8, 8};
    int[] tens = {3, 6, 6, 5, 5, 5, 7, 6, 6};

    public static void main(String[] args) {
        Problem17 problem = new Problem17();
    }

    public Problem17() {
        int sum = 0;
        for (int i = 0; i < ones.length; i++) {
            sum += ones[i];
            sum += ones[i] + HUNDRED;
        }
        for (int i = 0; i < tens.length; i++) {
            sum += tens[i];
        }

        for (int i = 0; i < teens.length; i++) {
            sum += teens[i];
        }

        for (int i = 1; i < tens.length; i++) {
            for (int j = 0; j < ones.length; j++) {
                sum += tens[i] + ones[j];
            }
        }

        for (int h = 0; h < ones.length; h++) {
            for (int i = 0; i < ones.length; i++) {
                sum += ones[h];
                sum += HUNDRED;
                sum += AND;
                sum += ones[i];
            }
            for (int i = 0; i < tens.length; i++) {
                sum += ones[h];
                sum += HUNDRED;
                sum += AND;
                sum += tens[i];
            }

            for (int i = 0; i < teens.length; i++) {
                sum += ones[h];
                sum += HUNDRED;
                sum += AND;
                sum += teens[i];
            }

            for (int i = 1; i < tens.length; i++) {
                for (int j = 0; j < ones.length; j++) {
                    sum += ones[h];
                    sum += HUNDRED;
                    sum += AND;
                    sum += tens[i];
                    sum += ones[j];
                }
            }
        }
        sum += ONE + THOUSAND;
        System.out.print(sum);
    }
}
