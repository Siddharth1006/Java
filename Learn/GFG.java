import java.io.*;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GFG{
    //Given a number, find the number of digits in that number
    //ALTERNATE SOLUTION
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int countOfDigits = 0;
        int N = number;

        while (N != 0){
            N = N / 10;
            countOfDigits++;
        }

        System.out.println("The number of digits in the number " + number + " is: " + countOfDigits);
    }
}
