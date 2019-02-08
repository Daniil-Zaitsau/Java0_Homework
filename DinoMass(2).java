import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DinoMass {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter dinosaur mass(kilogram):");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double mass = Double.parseDouble(reader.readLine());

        System.out.printf("%.2f kilograms is %.2f milligrams\n", mass, mass*1000000);
        System.out.printf("%.2f kilograms is %.2f grams\n", mass, mass*1000);
        System.out.printf("%.2f kilograms is %.4f tons\n", mass, mass/100);
    }
}
