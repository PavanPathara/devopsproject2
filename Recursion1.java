public class Recursion1 {

    // Method to calculate factorial using recursion
    public static int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: n * factorial of (n-1)
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Hardcoded number to calculate its factorial
        int num = 5;
        
        // Call the factorial method and print the result
        int result = factorial(num);
        System.out.println("The factorial of " + num + " is: " + result);
    }
}

