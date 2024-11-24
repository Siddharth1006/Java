import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class GFG{
    public static boolean SYSTEM_LOCAL = true;

    public static int lcm (int num1 , int num2) {
        int lcm = Math.max(num1, num2);
        for (int i = lcm; i <= num1 * num2; i += lcm) {
            if (i % num1 == 0 && i % num2 == 0) {
                lcm = i;
                break;
            }
        }
        return lcm;
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
            int A = sc.nextInt();
            int B = sc.nextInt();

            int ans = lcm(A, B);
            System.out.println(ans);
        }
        sc.close();
    }
}