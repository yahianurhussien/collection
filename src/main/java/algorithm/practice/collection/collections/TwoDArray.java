package algorithm.practice.collection.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class TwoDArray {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });


        bufferedReader.close();

        System.out.println(arr);
        System.out.println(largestSumHourGlass(arr));

    }

    private static int largestSumHourGlass(List<List<Integer>> arr) {

        int largest = Integer.MIN_VALUE;

        for ( int row = 0; row < arr.size() - 2; row++){


            for( int column = 0; column < arr.size()-2; column++ ){
                int   sum =      arr.get(row).get(column)
                        + arr.get(row).get(column+1)
                        + arr.get(row).get(column+ 2)
                        + arr.get(row+1).get(column+1)
                        + arr.get(row+2).get(column)
                        + arr.get(row+2).get(column+ 1)
                        + arr.get(row+2).get(column+ 2);

                if (sum > largest)
                    largest = sum;


            }

        }



        return largest;


    }


//    sample input
//    1 1 1 0 0 0
//    0 1 0 0 0 0
//    1 1 1 0 0 0
//    0 0 2 4 4 0
//    0 0 0 2 0 0
//    0 0 1 2 4 0

//    checks
//    a b c
//      d
//    e f g

//    output
//    19


}

