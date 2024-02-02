package algorithm.practice.collection.string;

import java.util.Scanner;

public class RegularExpressionUserNameCheck {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
    // this expression checks username using regex
    // username should be at 8 - 30 charachters
    // consists of alphanumeric and underscore


    //input example
    //Yahia -  not valid
    //ynurhusssien - valid
}

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

