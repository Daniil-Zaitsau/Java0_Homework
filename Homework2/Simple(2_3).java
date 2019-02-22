import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = 0;
        try {
            num = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Enter correct number!");
            System.exit(0);
        }

        if (num <= 0) {
            System.out.println("It isn't simple number.");
        } else {
            int count = 1;

            for (int i = 1; i <= num/2; i++) {
                if (num % i == 0){
                    count++;
                }
            }

            if (count == 2) {
                System.out.println("Is simple number");
            } else {
                System.out.println("It isn't simple number.");
            }
        }
    }
}
