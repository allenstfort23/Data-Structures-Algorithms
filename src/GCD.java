public class GCD {
    // Greatest Common Divisor
    public static void main(String[] args) {
        int a = 108;
        int b = 48;
        System.out.println("GCD of a and b is " + calcGcd(a, b));
    }

    private static double calcGcd(int a, int b) {
        if(b != 0) {
            return calcGcd(b, a % b);
        } else  {
            return a;
        }
    }
}
