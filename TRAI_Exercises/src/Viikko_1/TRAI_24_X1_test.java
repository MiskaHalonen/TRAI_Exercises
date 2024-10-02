package Viikko_1;

import java.util.Arrays;
import java.util.Random;

/**
 * Test class for TRA I 2024 task X1.
 */
public class TRAI_24_X1_test {

    static Random rnd = new Random();

    static TRAI_24_X1 mySolution = new TRAI_24_X1_miskah(); /* <-- Own userid here  */


    public static void main(String[] args) {

        // array size
        int N = 11;
        if (args.length > 0)
            N = Integer.parseInt(args[0]);

        // seed for random variables
        int seed = 42;
        if (args.length > 1)
            seed = Integer.parseInt(args[1]);

        // amount of printing
        int print = 7;
        if (args.length > 2)
            print = Integer.parseInt(args[2]);

        rnd.setSeed(seed);

        boolean ok = true;

        // test with different inputs
        ok &= testResultX1(1, 1, 1, print);
        ok &= testResultX1(2, 2, 4, print);
        ok &= testResultX1(2, 2, 2, print);
        ok &= testResultX1(3, 1, 3, print);
        ok &= testResultX1(3, 1, 10, print);
        ok &= testResultX1(4, 1, 10, print);
        ok &= testResultX1(N, 1, N, print);
        ok &= testResultX1(N, 1, N*2, print);
        ok &= testResultX1(N/2, 1, N, print);
        ok &= testResultX1(N*2, 0, N, print);
        ok &= testResultX1(2, 300, 310, print);    // toimiihan myÃ¶s isommilla luvuilla?
        ok &= testResultX1(5, 300, 310, print);
        ok &= testResultX1(0, 0, 0, print);

        if (ok)
            System.out.println("All fixed tests were correct.");

        // set "random" seed
        rnd.setSeed(System.currentTimeMillis());

        // test many random inputs
        int nTest = 1000;
        int k = 0;
        int errors = 0;
        while (k < nTest) {
            k++;
            if (! testResultX1(rnd.nextInt(nTest)+2, rnd.nextInt(nTest), rnd.nextInt(nTest) + nTest, 0))
                errors++;
            if (errors >= 30)
                break;
        }
        if (errors > 0)
            ok = false;
        System.out.println("\nOut of " + k + " extra tests, " + (k-errors) + " were correct.");

        if (ok)
            System.out.println("\nAll tests gave correct answer.\n\nRemeber self-evaluation.");
        else
            System.out.println("\nSome tests had errors.");

    }   // main()


    /**
     * Test the tasks with a random input.
     * @param n input size
     * @param min smallest element
     * @param max largest element
     * @param print amount of printing
     * @return true if result was expected, false otherwise
     */
    static boolean testResultX1(int n, int min, int max, int print) {

        // generate input, make a copy of input
        Integer[] A = randomArray(n, min, max);
        Integer[] cA = Arrays.copyOf(A, A.length);

        if (print > 0) System.out.println("\nTest n="+n + " min="+min + " max=" + max);
        if (n < 20 && print > 2 || print > 5) System.out.println("A[" + n + "]: " + Arrays.toString(A));

        Integer expected = max - min; // expected result
        if (n == 0)
            expected = null;

        // make the call for your solution
        Integer result = mySolution.maxMinDiff(A);

        // compare to expected result
        boolean equal = java.util.Objects.equals(result, expected);

        // print results
        if (print > 1) System.out.println("Result: " + result);
        if (print > 0 && ! equal)
            System.out.println("Wrong result: " + result + ", expected: " + expected);

        boolean contentUnchanged = Arrays.equals(A, cA);
        if (! contentUnchanged && print > 0)
            System.out.println("Error: method modifies the content of the input!");

        if (print > 1 && equal && contentUnchanged)
            System.out.println("Test ok");

        return equal && contentUnchanged;

    }



    /**
     * Generate random array of size n where min is the smallest element and max is the largest element.
     * @param n number of elements
     * @param min smallest element
     * @param max largest element
     * @return the generated arrasy
     */
    static Integer[] randomArray(int n, int min, int max) {
        if (n < 0 || max < min || (n == 1 && min != max))
            throw new RuntimeException("Not possible to generate!");
        Integer[] A = new Integer[n];

        if (n == 0)
            return A;
        if (n == 1) {
            A[0] = min; // == max
            return A;
        }

        for (int i = 0; i < n; i++) {
            A[i] = min + rnd.nextInt(max-min+1);
        }
        int minIndex = rnd.nextInt(n);
        int maxIndex;
        do {
            maxIndex = rnd.nextInt(n);
        } while (minIndex == maxIndex);

        A[minIndex] = min;
        A[maxIndex] = max;
        return A;
    }

}