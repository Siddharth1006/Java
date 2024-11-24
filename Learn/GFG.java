import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class GFG{
    public static int gcd (int a , int b) {
        int smaller = Math.min(a, b);
        int larger = Math.max(a, b);
        int remainder = larger % smaller;
        while (remainder != 0) {
            larger = smaller;
            smaller = remainder;
            remainder = larger % smaller;
        }
        return smaller;
    }
    public static int lcm (int a , int b) {
        //u x v = LCM(u, v) * GCD (u, v)

        return (a * b)/gcd(a , b);
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

            int ans = lcm(A, B);
            System.out.println(ans);
        }
        sc.close();
    }
}