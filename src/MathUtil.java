public class MathUtil {

    // Static Methods
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // A number less than or equal to 1 is not prime
        for (int i = 2; i * i <= n; i++) {  // Loop to check divisibility up to the square root of n
            if (n % i == 0) return false; // If divisible, not prime
        }
        return true;
    }
    
    // Method to calculate the Greatest Common Divisor (GCD) using the Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) { // Keep updating a and b until b becomes zero
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; // The GCD is stored in a
    }

    // Method to calculate the Least Common Multiple (LCM)
    public static int lcm(int a, int b) { 
        // LCM is calculated by (a * b) divided by GCD of a and b
        return (a * b) / gcd(a, b);
    }

    // Method to find the nth Fibonacci number iteratively
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1; // Initialize the first two Fibonacci numbers
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b; // Next Fibonacci number is sum of the previous two
            a = temp;
        }
        return b;
    }

    // Method to calculate factorial of a number iteratively
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1; // Base case for n = 0 or n = 1
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;  // Multiply result by each number up to n
        }
        return result;
    }

    // Non-Static Methods
    // Method to check if a number is a perfect number
    public boolean isPerfectNumber(int n) {
        int sum = 0;
        // Sum all divisors of n that are less than or equal to n / 2
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    // Method to calculate the sum of digits of a number
    public int sumOfDigits(int n) {
        int sum = 0;
        // Loop to add each digit to sum
        while (n != 0) {
            sum += n % 10; // Add the last digit to sum
            n /= 10; // Remove the last digit
        }
        return sum;
    }

    // Method to reverse a number
    public int reverseNumber(int n) {
        int reversed = 0;
        // Loop to build the reversed number
        while (n != 0) {
            reversed = reversed * 10 + n % 10; // Add the last digit to reversed
            n /= 10; // Remove the last digit
        }
        return reversed;
    }

    // Method to check if a number is an Armstrong number
    public boolean isArmstrongNumber(int n) {
        int sum = 0, temp = n;
        int digits = String.valueOf(n).length(); // Count the number of digits
        // Loop to calculate the sum of each digit raised to the power of the number of digits
        while (temp != 0) {
            int digit = temp % 10; 
            sum += (int) Math.pow(digit, digits); // Add the power of the digit to sum
            temp /= 10; // Remove the last digit
        }
        return sum == n;
    }

    // Method to find the next prime number after n 
    public int nextPrime(int n) {
        int next = n + 1; // Start with the next number after n
        // Loop until a prime number is found
        while (!isPrime(next)) {
            next++; // Increment next until it is prime
        }
        return next;
    }
}
