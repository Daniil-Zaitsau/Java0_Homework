import java.util.Scanner;

public class Nod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int numA = 0;
        int numB = 0;

        try {
            numA = scanner.nextInt();
            numB = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        if (numA <= 0 || numB <= 0) {
            System.out.println("Isn't natural numbers.");
        } else {
            int minNum = (numA > numB) ? numB : numA;
            int nod = 0;
            for (int i = 1; i <= minNum; i++) {
                if (numA % i == 0 && numB % i == 0) {
                    nod = i;
                }
            }
            System.out.println("NOD is " + nod + ". NOK is " + numA * numB / nod + ".");
        }
    }
}
