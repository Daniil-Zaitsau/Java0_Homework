import java.util.Scanner;

public class Frendly {
    public static void main(String[] args)   {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start point of diapason :");
        int first = scanner.nextInt();

        System.out.println("Enter finish of diapason :");
        int last = scanner.nextInt();

        if(first > last){
            System.out.println("Incorrect input");
        }else {
            for (int k = first; k <= last; k+=4){      //все друж. числа делятся на 4
                for (int j = k+1; j <= last; j++){
                    if(dividers(k) == j && dividers(j) == k){
                        System.out.println(k + " " + j);
                    }
                }
            }
        }
    }

    private static int dividers(int x){
        int sum = 0;
        for(int i = 1; i <= x/2;i++)
            if(x % i == 0)  sum += i;
        return sum;
    }

}
