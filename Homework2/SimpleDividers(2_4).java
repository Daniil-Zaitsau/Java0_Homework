import java.util.Scanner;

public class JavaTasks {
    public static void main(String[] args)   {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");

        int num = 0;
        try {
             num = scanner.nextInt();
        } catch (Exception e){
            System.out.println("Incorrect input!");
            System.exit(0);
        }

        if (num <= 0){
            System.out.println("Isn't natural number.");
        } else {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println(i + " is divider number " + num);
                    int count = 1;

                    for (int k = 1; k <=i/2; k++){
                        if (i%k == 0){
                            count++;
                        }
                    }

                    if(count == 2){
                        System.out.println("Is simple divider!\n");
                    } else {
                        System.out.println("But not simple.\n");
                    }
                }
            }
        }
    }
}
