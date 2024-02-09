package algorithm.practice.collection;

import java.util.Scanner;

public class StringToken {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] tokens = s.trim().split("[ !,?._'@]+");

        if (s.trim().isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(tokens.length);
            for (String str : tokens) {
                System.out.println(str);
            }
        }


        scan.close();

        // input example'
        // He is a very very good boy, isn't he?
        //

    }


}
