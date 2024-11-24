import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class GFG{
    public static int gcd (int a , int b) {
        // if b=0, a is the GCD
        if (b == 0)
            return a;
            // call the gcd() method recursively by
            // replacing a with b and b with
            // difference(a,b) as long as b != 0
        else
            return gcd(b, Math.abs(a - b));
    }
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream(new File("Learn/input-file.txt")));
        System.setOut(new PrintStream(new File("Learn/output-file.txt")));
//        System.setErr(new PrintStream(new File("err_output-file.txt")));

        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            int ans = gcd(A, B);
            System.out.println(ans);
        }
        sc.close();
    }
}