import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first radius:");
        double R1 = Double.parseDouble(reader.readLine());

        System.out.println("Enter second radius:");
        double R2 = Double.parseDouble(reader.readLine());

        if(R2>R1){
            System.out.println("The first radius should be greater than second!");
        } else{
            System.out.println("The area is " + Double.toString(Math.PI*R1*R1 - Math.PI*R2*R2));
        }
    }
}
