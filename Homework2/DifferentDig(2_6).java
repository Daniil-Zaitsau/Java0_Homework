import java.util.Scanner;

public class Different {
    public static void main(String[] args)   {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = 0;

        try {
            num = scanner.nextInt();
        } catch (Exception e){
            System.out.println("Incorrect input!");
        }

        if (num <= 0){
            System.out.println("Isn't natural number.");
        } else {
            System.out.println("First method:");
            System.out.println("There are " + strMethods(num) + " different digits.\n");
            System.out.println("Second method:");
            System.out.println("There are " + notStrMethod(num) + " different digits.");
        }
    }

    private static int strMethods(int num){
        String str = String.valueOf(num);
        int count = 0;

        for (int i = 0; i < 10; i++){
            if(str.contains(String.valueOf(i))) count++;
        }

        return count;
    }

    private static int notStrMethod(int num){
        
        int count = 0;
        int saveNum = num;
        while (num > 0) {
            int locNum = saveNum;
            int digit = num % 10;
            count++;
            while (locNum > 0) {
                if (digit == locNum % 10) {
                    if(locNum > num){
                        locNum = 0;
                        count--;
                    }
                }
                locNum = locNum / 10;
            }
            num = num / 10;
        }
        return count;
    }
}
