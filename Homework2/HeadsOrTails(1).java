import java.util.Random;
import java.util.Scanner;

public class JavaTasks {
    public static void main(String[] args)   {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number of throws:");
        int coin = scanner.nextInt();
        
        int i = 0;
        while (i < coin){
            int num = random.nextInt();
            System.out.println( num % 2 == 0 ? "Head" : "Tail");
            i++;
        }

    }
}
