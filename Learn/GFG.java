import java.io.*;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GFG{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 2 numbers");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        System.out.println("Enter the operand=> + , - , * , / , %");
        sc.nextLine();
        char operand = sc.nextLine().charAt(0);

        calculate(firstNumber , secondNumber , operand);
    }

    static void calculate (int firstNumber,  int secondNumber , char operand) {
        switch (operand) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                double result = ((double) firstNumber / secondNumber);
                System.out.format("%.2f" , result);
                break;
            case '%':
                System.out.println(firstNumber % secondNumber);
                break;
            default:
                System.out.println("Invalid operand");
        }
    }
}
