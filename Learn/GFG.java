import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class GFG{
    public static boolean SYSTEM_LOCAL = true;

    public static int lcm (int a , int b) {
        int ans = Math.min(a, b);
        while (true) {
            if (ans % a == 0 && ans % b == 0){
                return ans;
            }
            ans++;
        }
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