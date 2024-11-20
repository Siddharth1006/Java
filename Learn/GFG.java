import java.io.*;
import java.util.Scanner;

public class GFG{
    public static void main(String[] args) {
        //using arguments

        if (args.length > 0) {
            //then lets iterate through all the values of the argument array
            System.out.println("Printing all arguments");
            for (String str : args) {
                System.out.println(str);
            }
        } else {
            System.out.println("Arguments array is empty");
        }
    }
}


