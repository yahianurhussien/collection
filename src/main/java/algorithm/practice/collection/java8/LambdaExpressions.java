package algorithm.practice.collection.java8;


import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }


    public PerformOperation isOdd() {

        return n -> n % 2 != 0;


    }

    public PerformOperation isPrime() {

        return n -> {
            boolean flag = true;
            if (n < 2) return false;
            for (int i = 2; i <= n / 2; ++i) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            return flag;
        };

    }

    public PerformOperation isPalindrome() {

        return n -> {
            String[] numeros = String.valueOf(n).split("");
            for (int i = 0; i < Math.floor(numeros.length / 2); i++) {
                if (!numeros[i].equals(numeros[numeros.length - i - 1])) {
                    return false;
                }
            }
            return true;
        };
    }

}
public class LambdaExpressions {

            public static void main(String[] args) throws IOException {
                MyMath ob = new MyMath();
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int T = Integer.parseInt(br.readLine());
                PerformOperation op;
                boolean ret = false;
                String ans = null;
                while (T--> 0) {
                    String s = br.readLine().trim();
                    StringTokenizer st = new StringTokenizer(s);
                    int ch = Integer.parseInt(st.nextToken());
                    int num = Integer.parseInt(st.nextToken());
                    if (ch == 1) {
                        op = ob.isOdd();
                        ret = ob.checker(op, num);
                        ans = (ret) ? "ODD" : "EVEN";
                    } else if (ch == 2) {
                        op = ob.isPrime();
                        ret = ob.checker(op, num);
                        ans = (ret) ? "PRIME" : "COMPOSITE";
                    } else if (ch == 3) {
                        op = ob.isPalindrome();
                        ret = ob.checker(op, num);
                        ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

                    }
                    System.out.println(ans);
                }
            }

//           sample input
//            5
//            1 4
//            2 5
//            3 898
//            1 3
//            2 12
//

//    output
//     EVEN
//     PRIME
//     PALINDROME
//     ODD
//     COMPOSITE
}



