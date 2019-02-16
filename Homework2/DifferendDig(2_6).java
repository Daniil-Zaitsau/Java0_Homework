import java.util.Scanner;

public class Different {
    public static void main(String[] args)   {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        String num = scanner.next();


        int count = 0;

        for (int i = 0; i < 10; i++){
            if(num.contains(String.valueOf(i))) count++;
        }
        System.out.println("There are " + count + " different digits.");
    }
}
