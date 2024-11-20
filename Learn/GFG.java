import java.io.*;
import java.util.Scanner;

public class GFG{
    public static void main(String[] args) {
        //using Console Class

//        Reading password without echoing the entered characters.
//        Reading methods are synchronized.
//        Format string syntax can be used.
//        Does not work in non-interactive environment (such as in an IDE).

        // Using Console to input data from user
        String name = System.console().readLine();

        System.out.println("You entered string " + name);
    }
}


