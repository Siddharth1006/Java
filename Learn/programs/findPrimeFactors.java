package programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class findPrimeFactors {
    public static boolean SYSTEM_LOCAL = true;

    public static void findAllPrimeFactors(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws FileNotFoundException {
        if (SYSTEM_LOCAL) {
            System.setIn(new FileInputStream(new File("Learn/input-file.txt")));
            System.setOut(new PrintStream(new File("Learn/output-file.txt")));
            System.setErr(new PrintStream(new File("err_output-file.txt")));
        }
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-- > 0) {
            int n = sc.nextInt();
            findAllPrimeFactors(n);
        }
        sc.close();
    }
}
