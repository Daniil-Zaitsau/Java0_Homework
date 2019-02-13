import java.util.Scanner;


public class Dragon {
    public static void main(String[] args)   {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old is dragon?");

        int ages = scanner.nextInt();

        int heads = 3;

        if (ages <= 0){
            System.out.println("Enter correct age!");
        } else {
            while (ages > 0) {
                if (ages > 300) {
                    heads += 1;
                } else if (ages > 200) {
                    heads += 2;
                } else heads += 3;
                ages--;
            }
            System.out.println("The dragon has " + heads + " heads, and " + heads*2 + " eyes.");
        }
    }
}
