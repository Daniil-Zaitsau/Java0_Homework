import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number");
        String num = reader.readLine();

        char[] arr = num.toCharArray();
        int sum = 0;
        int mult = 1;


       if(arr.length != 6){
            System.out.println("The number should consist of six digits!");
        }else {
            for (char a : arr) {
                sum += Character.getNumericValue(a);
                mult *= Character.getNumericValue(a);
            }
            System.out.println("arithmetic average is: " + sum/6.);
            System.out.println("geometric average is: " + Math.pow(mult, 1 / 6.)); 
       }
    }
}
