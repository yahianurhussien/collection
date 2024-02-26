package algorithm.practice.collection.array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class AbsoluteDiagonalDifference {



        /*
         * Complete the 'diagonalDifference' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts 2D_INTEGER_ARRAY arr as parameter.
         */

        public static int diagonalDifference(List<List<Integer>> arr) {
            // Write your code here

            int diagonal1 = 0;
            int diagonal2 = 0;

            for (int i = 0, j = 0, k = arr.size() - 1; i < arr.size(); i++, j++, k--) {
                diagonal1 += arr.get(i).get(j);
                diagonal2 += arr.get(i).get(k);
            }

            return Math.abs(diagonal1 - diagonal2);


        }


        public static void main(String[] args) throws IOException {

            List<List<Integer>> arr = new ArrayList<>();
            List<Integer> list1  = new ArrayList<>();
            list1.add(11);
            list1.add(2);
            list1.add(4);

            List<Integer> list2  = new ArrayList<>();
            list2.add(4);
            list2.add(5);
            list2.add(6);

            List<Integer> list3  = new ArrayList<>();
            list3.add(10);
            list3.add(8);
            list3.add(-12);
            arr.add(list1);
            arr.add(list2);
            arr.add(list3);
            System.out.println(diagonalDifference(arr));

        }

    }


