public class Main {
    public static void main(String[] args) {
        // Testing static methods from MathUtil
        System.out.println("isPrime(7): " + MathUtil.isPrime(7));
        System.out.println("gcd(12, 18): " + MathUtil.gcd(12, 18));
        System.out.println("lcm(12, 18): " + MathUtil.lcm(12, 18));
        System.out.println("fibonacci(7): " + MathUtil.fibonacci(7));
        System.out.println("factorial(5): " + MathUtil.factorial(5));

        // Creating object for non-static methods
        MathUtil mathUtil = new MathUtil();

        // Testing non-static methods from MathUtil
        System.out.println("isPerfectNumber(28): " + mathUtil.isPerfectNumber(28));
        System.out.println("sumOfDigits(123): " + mathUtil.sumOfDigits(123));
        System.out.println("reverseNumber(12345): " + mathUtil.reverseNumber(12345));
        System.out.println("isArmstrongNumber(153): " + mathUtil.isArmstrongNumber(153));
        System.out.println("nextPrime(10): " + mathUtil.nextPrime(10));
    }
}