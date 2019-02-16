import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Swipe {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter two numbers");
        int numA = Integer.parseInt(reader.readLine());
        int numB = Integer.parseInt(reader.readLine());

        System.out.println("Before swipe: " + numA + " " + numB);

        numA += numB;
        numB = numA - numB;
        numA -= numB;

        System.out.println("After swipe: " + numA + " " + numB);
    }
}
