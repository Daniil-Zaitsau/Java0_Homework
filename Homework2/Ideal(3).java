import java.util.Scanner;

public class Ideal {
    public static void main(String[] args)   {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++){
            if(num%i == 0 ) sum+=i;
        }

        if(sum == num){
            System.out.println("Ideal number.");
        } else {
            System.out.println("Not ideal number.");
        }
    }
}
