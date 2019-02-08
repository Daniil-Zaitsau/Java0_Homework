import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeNumbers {
    public static void main(String[] args) throws IOException {
        System.out.println("Input three numbers");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numA = Integer.parseInt(reader.readLine());
        int numB = Integer.parseInt(reader.readLine());
        int numC = Integer.parseInt(reader.readLine());

        if(numA != numB && numB != numC && numA != numC){
            System.out.println("All numbers are different");
        }else
            if(numA == numB && numB == numC){
                System.out.println("All numbers are equals");
            }else System.out.println("Two numbers from three are equals");
    }
}
