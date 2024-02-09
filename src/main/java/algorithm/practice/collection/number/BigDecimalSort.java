package algorithm.practice.collection.number;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class BigDecimalSort {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();


        //Sort using arrays sort method so that we can preserve the format inputs as it is
        Arrays.sort(s, 0, n, (a, b) -> {
            BigDecimal aBigDecimal = new BigDecimal(a);
            BigDecimal bBigDecimal = new BigDecimal(b);
            return bBigDecimal.compareTo(aBigDecimal);

        });

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}

