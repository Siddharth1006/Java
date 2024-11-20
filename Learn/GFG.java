import java.io.*;
import java.util.Scanner;

// To read from console using BufferedReader
public class GFG{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter an integer");

        //Taking integer input
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter a string");

        String b = br.readLine();

        //Printing
        System.out.println("Integer is: " + a + " and String is: " + b);
    }
}


// REFERENCES = https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo

