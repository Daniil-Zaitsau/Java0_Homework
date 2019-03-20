package controller.input;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInput {
    public int enter() {

        Scanner scanner = new Scanner(System.in);

        int num;
        String input = scanner.next();

        while (!isValid(input)){
            System.out.println("Enter correct number!");
            input = scanner.next();
        }
        num = Integer.parseInt(input);

        return num;
    }

    private boolean isValid(String input) {
        Pattern pattern  = Pattern.compile("([1-9])([0-9]{0,8})");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
