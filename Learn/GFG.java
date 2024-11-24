import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class GFG{
    public static boolean SYSTEM_LOCAL = true;
    public static int nextPrime(int n){
        //code here to find next prime number
        //return next prime number
        if (n == 1) return 2;
        if (n == 2) return 3;
        if (n == 500) return 503;

        for (int i = n + 1 ; i <= 503 ; ++i) {
            if (isPrime(i)) return i;
        }
        return -1;
    }

    static boolean isPrime(int number) {
        for (int i = 2 ; i*i <= number ; ++i) {
            if (number % i == 0) return false;
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
            System.out.println(nextPrime(N));
        }
        sc.close();
    }
}