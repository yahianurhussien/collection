package algorithm.practice.collection.exeptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {


        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


            Scanner scanner = new Scanner(System.in);

            try{
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                System.out.println(x/y);

            }catch(InputMismatchException e){
                System.out.println(e);
            }catch(ArithmeticException e ){
                System.out.println(e);
            }

        }
    }


