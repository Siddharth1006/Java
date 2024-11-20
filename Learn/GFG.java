import java.io.*;
import java.util.Scanner;

//Scanner is preferred instead of BufferedReader
public class GFG{
    public static void main(String[] args) throws IOException {
        //Byte streams process data byte by byte (8 bits).
        // Ex: FileInputStream is used to read from the source and
        // FileOutputStream to write to the destination.

        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;

        //Try block to check for exceptions
        try {
            sourceStream = new FileInputStream("temp/demo.rtf");
            targetStream = new FileOutputStream("temp/demoResponse.rtf");

            // now reading from sourceFIle and writing to target file
            int temp;

            while ((temp = sourceStream.read()) != -1){
                targetStream.write((byte) temp);
            }

            System.out.println("Program executed successfully!");

        } finally {
            // finally block executes when we are closing file for connections
            // to avoid memory leakage

            if (sourceStream != null)
                sourceStream.close();

            if (targetStream != null)
                targetStream.close();
        }
    }
}