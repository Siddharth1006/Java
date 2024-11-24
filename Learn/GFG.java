import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class GFG{
    public static boolean SYSTEM_LOCAL = true;
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;  // Base case for 0th Fibonacci number
        }
        if (n == 1) {
            return 1;  // Base case for 1st Fibonacci number
        }

        int a = 0, b = 1;  // F(0) = 0, F(1) = 1
        for (int i = 2; i <= n; i++) {
            int next = a + b;  // Next Fibonacci number is the sum of the last two
            a = b;  // Update a to the last Fibonacci number
            b = next;  // Update b to the current Fibonacci number
        }
        return b;  // Return the nth Fibonacci number
    }
    public static void main(String[] args) throws FileNotFoundException {
        if (SYSTEM_LOCAL) {
            System.setIn(new FileInputStream(new File("Learn/input-file.txt")));
            System.setOut(new PrintStream(new File("Learn/output-file.txt")));
            System.setErr(new PrintStream(new File("err_output-file.txt")));
        }
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            int N = sc.nextInt();
            System.out.println(fibonacci(N));
        }
        sc.close();
    }
}