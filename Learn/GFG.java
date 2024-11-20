import java.io.*;
import java.util.Scanner;

//Scanner is preferred instead of BufferedReader
public class GFG{
    public static void main(String[] args) throws IOException { // no need to handle any exception.
        int x = 100, y = 200;
        System.out.format("Value of x is : %d\n" , x);

        float z = (float) Math.PI;
        System.out.println(z);

        System.out.format("Value of PI = %.2f\n", z); // means print only 2 digits after decimal point
        System.out.format("Value of PI = %5.2f\n", z); // 5 means print at least 5 characters and 2 digits after decimal point
        //So, it will fill the extra characters with spaces

        System.out.format("Value of PI = %05.2f\n", z);
        //Same as above, but it will fill extra characters with 0's instead of spaces.

        System.out.format("x= %d, y= %d", x,y);
    }
}