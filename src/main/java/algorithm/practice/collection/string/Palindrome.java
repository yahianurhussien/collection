package algorithm.practice.collection.string;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {


    static String isPalindrome(String A) {

        Stack<Character> stack = new Stack<>();
        boolean flag = A.length() % 2 == 0;

        int i = 0;
        while (i < A.length() / 2) {

            stack.push(A.charAt(i));
            i++;
        }

        while (i < A.length()) {
            if (!flag) {
                flag = true;
                continue;

            }
            if (stack.size() != 0 && stack.peek().equals(A.charAt(i))) {
                stack.pop();
            }
            i++;
        }

        return stack.size() == 0 ? "Yes" : "No";
    }

    private static String isPalindromeOptimized(String a) {

        String reverseString = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            reverseString += a.charAt(i);
        }

        return a.equals(reverseString) ? "Yes" : "No";

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();


        System.out.println(isPalindrome(A));
        System.out.println(isPalindromeOptimized(A));

        // sample input
        //madam
        //java

    }
}




