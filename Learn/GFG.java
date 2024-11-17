import java.io.*;
import java.util.Scanner; //To use Scanner

//Scanner is preferred instead of BufferedReader
public class GFG{
    public static void main(String[] args) { // no need to handle any exception.
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a String: ");
        String str = sc.nextLine();
        System.out.println("You entered the string: "  + str);

        System.out.println("Please enter an integer");
        int x = sc.nextInt();
        System.out.println("You entered the Integer: " + x);

        System.out.println("Please enter a floating point number");
        float f = sc.nextFloat();
        System.out.println("You entered float: " + f);
    }
}