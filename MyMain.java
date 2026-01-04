/**
 * Lab 01: Java Basic Syntax
 * This class contains three exercises to practice basic Java programming concepts.
 */
public class MyMain {

    // =========================================================================
    // EXERCISE 1: Find the smallest of three numbers
    // =========================================================================
    /**
     * The function receives 3 numbers and prints the smallest of them all.
     * Example: If a = 3, b = 7 and c = 5, then it prints 3.
     *
     * @param a First number
     * @param b Second number
     * @param c Third number
     */
    public static void ex1(int a, int b, int c) {
        // Start by assuming the first number 'a' is the smallest
        int smallest = a;  // Initialize variable 'smallest' with value of 'a'

        // Check if the second number 'b' is smaller than our current smallest
        if (b < smallest) {   // if condition: compares b with current smallest
            smallest = b;     // If b is smaller, update 'smallest' to b's value
        }                     // End of first if block

        // Check if the third number 'c' is smaller than our current smallest
        if (c < smallest) {   // if condition: compares c with current smallest
            smallest = c;     // If c is smaller, update 'smallest' to c's value
        }                     // End of second if block

        // Print the final smallest value to the console
        System.out.println(smallest);  // println adds a newline after printing
    }  // End of ex1 method

    // =========================================================================
    // EXERCISE 2: Sum of odd numbers from 1 to n
    // =========================================================================
    /**
     * The function returns the sum of all the odd integer numbers from 1 to n.
     * Example: If n = 7, the function returns 16 (which is 1 + 3 + 5 + 7).
     *
     * @param n Number we want to stop adding at
     * @return Sum of all odd integer numbers in [1..n]
     */
    public static int ex2(int n) {
        // Initialize sum to 0 - this variable will accumulate the total
        int sum = 0;  // 'sum' starts at 0 because we haven't added anything yet

        // For loop: repeats from i=1 to i=n (inclusive)
        // Structure: for(initialization; condition; increment)
        for (int i = 1; i <= n; i++) {
            // i++ means i = i + 1 after each iteration

            // Check if current number 'i' is odd using modulus operator
            // % gives remainder: 7 % 2 = 1 (odd), 8 % 2 = 0 (even)
            if (i % 2 == 1) {      // If remainder when dividing by 2 is 1
                sum = sum + i;     // Add the odd number to our running total
                // Alternative: sum += i; (shorthand notation)
            }  // End of if block inside for loop
        }  // End of for loop

        // Return the calculated sum to whatever called this method
        return sum;  // 'return' sends the value back to the calling code
    }  // End of ex2 method

    // =========================================================================
    // EXERCISE 3: Print a hollow square pattern
    // =========================================================================
    /**
     * Given an integer number equal or bigger than 3, the function prints a pattern.
     * The pattern is a hollow square made of asterisks (*).
     *
     * @param n Number of lines to be printed, where n >= 3
     */
    public static void ex3(int n) {
        // OUTER LOOP: Controls which row we're on (from 1 to n)
        // row = 1: first iteration
        // row <= n: keep looping while this is true
        // row++: increment row by 1 after each iteration
        for (int row = 1; row <= n; row++) {

            // INNER LOOP: Controls which column we're on in the current row
            // col = 1: start at first column
            // col <= n: go up to nth column
            // col++: move to next column after printing
            for (int col = 1; col <= n; col++) {

                // Determine whether to print '*' or ' ' (space)
                // We print '*' if we're on:
                // 1. First row (row == 1) - top border
                // 2. Last row (row == n) - bottom border  
                // 3. First column (col == 1) - left border
                // 4. Last column (col == n) - right border
                // || means OR: if ANY condition is true
                if (row == 1 || row == n || col == 1 || col == n) {
                    // Print asterisk for border positions
                    System.out.print("*");  // print() doesn't add newline
                } else {
                    // Print space for interior positions (inside the square)
                    System.out.print(" ");  // print() keeps cursor on same line
                }  // End of if-else block

            }  // End of inner for loop (columns)

            // After printing all columns in current row, move to next line
            System.out.println();  // println() with no arguments = newline only

        }  // End of outer for loop (rows)
    }  // End of ex3 method

    // =========================================================================
    // TEST METHOD: Runs all exercises with sample values
    // =========================================================================
    /**
     * This function is used to test the exam functions.
     * It calls each exercise with specific test values.
     */
    public static void test() {
        // Print section header for ex1 tests
        System.out.println("----------- ex1 -----------");

        // Test ex1 with values 3, 7, 5
        ex1(3, 7, 5);  // Expected output: 3 (smallest of 3,7,5)

        // Test ex1 with values 1, 2, 3  
        ex1(1, 2, 3);  // Expected output: 1 (smallest of 1,2,3)

        // Print section header for ex2 tests
        System.out.println("\n----------- ex2 -----------");
        // \n means newline character

        // Test ex2 with n=7 and print result
        System.out.println(ex2(7));   // Expected output: 16 (1+3+5+7)

        // Test ex2 with n=10 and print result  
        System.out.println(ex2(10));  // Expected output: 25 (1+3+5+7+9)

        // Print section header for ex3 tests
        System.out.println("\n----------- ex3 -----------");

        // Test ex3 with n=4 (4x4 hollow square)
        ex3(4);  // Prints pattern

        // Print empty line for separation between patterns
        System.out.println();  // Just a newline with nothing before it

        // Test ex3 with n=6 (6x6 hollow square)
        ex3(6);  // Prints pattern
    }  // End of test method

    // =========================================================================
    // MAIN METHOD: Program entry point
    // =========================================================================
    /**
     * Main Method - Entry point of the program
     * This is where Java starts executing when you run the program
     *
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // All Java programs need a main method
        // 'public' = accessible from anywhere
        // 'static' = can be called without creating object
        // 'void' = doesn't return a value
        // 'String[] args' = array of command-line arguments

        // Call the test function to run all exercises
        test();  // This executes the test() method above

        // Program ends here - returns to operating system
    }  // End of main method

}  // End of MyMain class