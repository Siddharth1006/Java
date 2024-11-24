//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {


// } Driver Code Ends
//User function Template for Java

// User function Template for Java

    public static void triangle(int s) {

        // Write your code here
        for (int i = 1; i <= s; i++) {
            if (i == 1) {
                // Print the top of the triangle
                System.out.println("*");
            } else if (i == s) {
                // Print the base of the triangle
                for (int j = 1; j <= s; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                // Print the intermediate rows
                System.out.print("*"); // First star
                for (int j = 1; j <= (i - 1) * 2 - 1; j++) {
                    System.out.print(" "); // Space in between
                }
                System.out.println("*"); // Last star
            }
        }
    }

//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int s = scn.nextInt();
            triangle(s);

            System.out.println("~");
        }
        scn.close();
    }
}
// } Driver Code Ends