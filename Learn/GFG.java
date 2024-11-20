import java.io.*;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GFG{

    public static void main(String[] args) {
        String Branch = "CSE";
        int year = 3;

        switch (year) {
            case 1:
                System.out.println("One of the 3 main courses = Engineering Physics, Basic Electronics Engineering, Problem Solving and Computer Programming");
                break;
            case 2:
                switch (Branch) {
                    case "CSE":
                        System.out.println("3 electives - French , German, Basic Electronics Engineering");
                        break;
                    case "ECE":
                        System.out.println("3 electives - Chemical engineering, French, Russian");
                        break;
                    default:
                        System.out.println("3 electives - French, German, Business Management");
                }
                break;
            case 3:
                System.out.println("No electives. Internship");
                break;
            case 4:
                System.out.println("Placements/Final Year Research");
                break;
            default:
                System.out.println("Engineering takes 4 years usually..");
        }
    }
}
