package algorithm.practice.collection.number;

import java.io.*;
import java.math.*;
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


