import java.io.*;
import java.util.Scanner;

//Scanner is preferred instead of BufferedReader
public class GFG{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer");
        //using nextInt() to parse Integer values
        int a = sc.nextInt();

        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("Enter a double value: ");
        double doub = sc.nextDouble();
        System.out.println("Enter a floating point value");
        float flot = sc.nextFloat();
        System.out.println("Enter a long value");
        long longlongvalue = sc.nextLong();

        System.out.format("All values : %d , %s , %3.2f , %04.2f , %dl" , a , str, doub ,flot , longlongvalue);
    }
}


