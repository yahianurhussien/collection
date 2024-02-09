package algorithm.practice.collection.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimeNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        boolean isPrime = new BigInteger(n).isProbablePrime(1);

        if (isPrime)
            System.out.println("prime");
        else
            System.out.println("not prime");


    }


    // Input - 13 - prime
    //input - 8 - not prime
}


