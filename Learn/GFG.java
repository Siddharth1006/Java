import java.io.*;

public class GFG{
    public static void main(String[] args) throws IOException {
        //throws is a keyword that is used to tell the compiler that this code can throw "IOException"
        //whoever is using this code has to cast/handle this exception.
        BufferedReader BuffReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter an integer");
        int x = Integer.parseInt(BuffReader.readLine()); // Explicitly typecasting a stream of characters to an integer

        System.out.println("You entered: " + x);
    }
}