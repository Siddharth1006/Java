import java.io.*;
import java.util.Scanner;

//Scanner is preferred instead of BufferedReader
public class GFG{
    public static void main(String[] args) throws IOException {
        // initially assigning null. Nothing to read

        FileReader sourceStream = null;

        //try block to catch exceptions
        try {
            sourceStream = new FileReader("temp/demo.rtf");

            int temp;

            // If there is content inside file
            // then read
            while ((temp = sourceStream.read()) != -1) {
                System.out.print((char) temp);
            }

            System.out.println("Program executed successfully!");
        } finally {

            // Closing stream as it is NO longer in use

            if (sourceStream != null) {
                sourceStream.close();
            }
        }
    }
}