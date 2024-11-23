import java.io.*;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GFG{
    // Write a program that takes 5 pairs of integers from user.
    // For every pair (x,y), it should print x/y. if y == 0 , it should continue
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            i += 1;
            System.out.print("x: ");
            int x = sc.nextInt();
            System.out.print("y: ");
            int y = sc.nextInt();
            if (y == 0) continue;
            System.out.println("For the given pair, x/y: " + ((double)x / y));
        }
    }
}
