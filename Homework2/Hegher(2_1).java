import java.util.Scanner;

public class Higher {
    public static void main(String[] args)   {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = scanner.nextInt();
        num = Math.abs(num);

        int max = 0;

        while (num > 0){
            int n = num % 10;
            num/=10;

            if(n > max){
                max = n;
            }
        }

        System.out.println("Higher point is: " + max);
    }
}
