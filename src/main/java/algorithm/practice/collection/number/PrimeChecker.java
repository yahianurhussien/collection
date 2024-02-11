package algorithm.practice.collection.number;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Prime{
    String result = "";
    public void checkPrime(String... numbers){

        boolean isPrime = false;
        for (String n: numbers) {
            isPrime = new BigInteger(n).isProbablePrime(1);

            if (isPrime){
                result += n+" ";
            }
        }


        System.out.println(result);
        result = "";
    }


}
public class PrimeChecker {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String n1 = br.readLine();
        String n2 =  br.readLine();
        String n3 =  br.readLine();
        String n4 =  br.readLine();
        String n5 =  br.readLine();

        Prime p = new Prime();
        p.checkPrime(n1);
        p.checkPrime(n1,n2);
        p.checkPrime(n1,n2,n3);
        p.checkPrime(n1,n2,n3,n4,n5);

    }
}
