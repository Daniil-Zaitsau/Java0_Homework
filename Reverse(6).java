import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Кумукыу {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number");
        String num = reader.readLine();
        
       if(num.length() != 7){
            System.out.println("The number should consist of seven digits!");
        }else {
           StringBuilder sbf = new StringBuilder(num);
           int rev = Integer.parseInt(sbf.reverse().toString());
           System.out.println(rev);
       }
    }
}
