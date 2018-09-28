package gitpush;

public class GitPush {

    /**
     *
     * @param base
     * @param exponent
     * @return
     */
    public static double power(double base, int exponent) {
        double total = 1;
        for (int counter = 1; counter <= exponent; counter++) {
            total*= base;
        }
       System.out.println(total);
                return total;
    }

    public static void main(String[] args) {
        power(2,3);

    }

}
