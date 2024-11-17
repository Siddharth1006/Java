import java.io.*;

public class GFG{
    public static void main(String[] args) throws IOException {
        BufferedReader BuffReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a String: ");
        String str = BuffReader.readLine();

        System.out.println("You entered a String: " + str);
    }
}