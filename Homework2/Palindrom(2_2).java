import java.util.Scanner;

public class JavaTasks {

    public static void main(String[] args)   {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");

        int num = 0;
        try {
             num = scanner.nextInt();
        } catch (Exception e){
            System.out.println("Please, enter correct number.");
            System.exit(0);
        }

        num = Math.abs(num);

        System.out.println("First method:");
        System.out.println(strBuild(num) ? "Is palindrom.\n" : "It isn't palindrom.\n");

        System.out.println("Second method:");
        System.out.println(palindrom(num) ? "Is palindrom.\n" : "It isn't palindrom.\n");

    }

    private static boolean strBuild(int num){
        String str = String.valueOf(num);
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }

    private static boolean palindrom(int num){
        String str = String.valueOf(num);
        boolean isPalin = true;
       
        for (int i = 0; i < str.length() & isPalin; i++){
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                isPalin = false;
            }
        }

        return isPalin;
    }
}
