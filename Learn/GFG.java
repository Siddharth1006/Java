import java.io.*;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GFG{
    public static void main(String[] args) throws ParseException  {
        //Formatting date as per the given pattern in the argument
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        String date = ft.format(new Date());

        System.out.println("Formatted Date: " + date);

        String anotherDate = "23/11/2024";
        ft = new SimpleDateFormat("MM/dd/yyyy");
        Date parsedAnotherDate = ft.parse(anotherDate); // We need to handle exception here. So, adding it.
        System.out.println("Another date in another format: " + parsedAnotherDate);

        System.out.println("Parsed Date: " + parsedAnotherDate);
    }
}


