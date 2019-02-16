import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args)   {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        String num = scanner.next();

        StringBuilder sb = new StringBuilder(num);

        if(num.equals(sb.reverse().toString())){
            System.out.println("Is palindrom");
        }
    }
}
