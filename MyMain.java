
import java.lang.Math;

/**
 * The class tests the 3 functions of Lab01.
 * @author Ignacio.Castineiras
 * @student Katie McGrath
 * @studentNumber R00261559
 *
 */
public class MyMain {

    //----------------------------------------------
    // ex1
    //----------------------------------------------
    /**
     * The function receives 3 numbers and prints by the screen the smallest of them all.<br>
     * Example: If a = 3, b = 7 and c = 5, then it prints 3.
     * @param a: First number
     * @param b: Second number
     * @param c: Third number
     *
     */
    public static void ex1(int a, int b, int c){
        //----------------------------
        // COMPLETE YOUR CODE HERE
        //----------------------------

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int middle = a + b + c - max - min;
        System.out.println(min, middle, max);


        //----------------------------
    }


    //----------------------------------------------
    // ex2
    //----------------------------------------------
    /**
     * The function returns the sum of all the odd integer numbers from 1 to n.<br>
     * Example: If n = 7, the function returns 16 (which is 1 + 3 + 5 + 7).
     * @param n: Number we want to stop adding at
     * @return Sum of all odd integer numbers in [1..n]
     *
     */
    public static int ex2(int n){
        int res = 0;

        //----------------------------
        // COMPLETE YOUR CODE HERE
        //----------------------------





        //----------------------------

        return res;
    }


    //----------------------------------------------
    // ex3
    //----------------------------------------------
    /**
     * Given an integer number equal or bigger than 3, the function prints a pattern by screen.<br>
     * Example1: If n = 3, then it prints<br>
     * <pre>
     * {@code
     * ***
     * * *
     * ***
     * }
     * </pre>
     * Example2: If n = 5, then it prints<br>
     * <pre>
     * {@code
     * *****
     * *   *
     * *   *
     * *   *
     * *****
     * }
     * </pre>
     * Example3: If n = 7, then it prints<br>
     * <pre>
     * {@code
     * *******
     * *     *
     * *     *
     * *     *
     * *     *
     * *     *
     * *******
     * }
     * </pre>
     *
     * @param n: Number of lines to be printed, where n >= 3
     *
     */
    public static void ex3(int n){
        //----------------------------
        // COMPLETE YOUR CODE HERE
        //----------------------------





        //----------------------------
    }


    /**
     * This function is used to test the exam functions.
     */
    public static void test(){
        //1. We create extra variables for the results
        int res1;
        String res2;
        double res3;

        //---------------------
        // TESTS
        //---------------------

        //ex1
        System.out.println("----------- ex1 -----------");
        ex1(5, 7, 3);
        ex1(1, 2, 3);

        //ex2
        System.out.println("----------- ex2 -----------");
        res1 = ex2(7);
        System.out.println(res1);

        res1 = ex2(20);
        System.out.println(res1);

        //ex3
        System.out.println("----------- ex3 -----------");
        ex3(4);
        ex3(6);
    }

    /**
     * Main Method.
     * @param args: We will run the program parameter free, so do not worry about it.
     */
    public static void main(String[] args) {
        test();
    }

}
