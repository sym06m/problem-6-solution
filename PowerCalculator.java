
// Problem 6: Compute a^n
// Complexity: Time - O(log N), Space - O(log N) due to recursion

public class PowerCalculator {

    // Function to compute a^n using fast exponentiation
    public static long power(int a, int n) {
        if (n == 0) return 1;
        long half = power(a, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * a;
        }
    }

    public static void main(String[] args) {
        // Example input
        int a = 2;
        int n = 10;

        // Output result
        System.out.println("Result: " + power(a, n));  // Output: 1024
    }
}
