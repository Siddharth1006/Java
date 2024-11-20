import java.io.*;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GFG{
    public static void main(String[] args) {
        // x is stored using 32 bit 2's complement form.
        // Binary representation of -1 is all 1s (111..1)
        int x = -1;

//        operator '>>>' denotes unsigned right shift operator and always fill 0 irrespective of the sign of the numbe

        // The value of 'x>>>29' is 00...0111
        System.out.println(x >>> 29);

        // The value of 'x>>>30' is 00...0011
        System.out.println(x >>> 30);

        // The value of 'x>>>31' is 00...0001
        System.out.println(x >>> 31);
    }
}
