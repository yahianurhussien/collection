package algorithm.practice.collection.number;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String as = scanner.next();
        String bs = scanner.next();

        BigDecimal a = new BigDecimal(as);
        BigDecimal b = new BigDecimal(bs);



        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
