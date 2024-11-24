import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class GFG{
    public static boolean SYSTEM_LOCAL = true;
    static boolean[] sieveOfEratosthenes(int N) {
        //https://www.geeksforgeeks.org/sieve-of-eratosthenes/
        // Create a boolean array "prime[0..n]" and
        // initialize all entries it as true. A value in
        // prime[i] will finally be false if i is Not a
        // prime, else true.
        boolean[] prime = new boolean[N + 1];
        for (int i = 0; i <= N; i++)
            prime[i] = true;

        for (int p = 2; p * p <= N; p++) {
            // If prime[p] is not changed, then it is a
            // prime
            if (prime[p]) {
                // Update all multiples of p greater than or
                // equal to the square of it numbers which
                // are multiple of p and are less than p^2
                // are already been marked.
                for (int i = p*p; i <= N; i += p)
                    prime[i] = false;
            }
        }
        return prime;
    }
    static int solve(int n) {
        boolean[] primes = sieveOfEratosthenes(501);

        for (int i = n+1 ; i < 501 ; ++i) {
            if (primes[i]) {
                return i;
            }
        }

        return -1;
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
            System.out.println(solve(N));
        }
        sc.close();
    }
}