import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class GFG{
    public static boolean SYSTEM_LOCAL = true;

    static boolean isPrime(int n) {
        if (n == 1)
            return false;

        if (n == 2 || n == 3)
            return true;

        if (n%2 == 0 || n%3 == 0)
            return false;

        for (int i = 5 ; i*i <= n ; i += 6){
            if(n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true;
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
            System.out.println(isPrime(N) ? "YES" : "NO");
        }
        sc.close();
    }
}