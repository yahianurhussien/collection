package algorithm.practice.collection.array;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int aAward = 0;
        int bAward = 0;

        for (int i = 0; i < a.size(); i++){
            if(a.get(i) > b.get(i)){
                aAward++;
            }else if (a.get(i) < b.get(i)){
               bAward++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(aAward);
        result.add(bAward);
        return result;

    }

}


public class AwardComparing {
    public static void main(String[] args) throws IOException {


        System.out.println(
                Result.compareTriplets(
                        Arrays.asList(5, 6, 7), Arrays.asList(3, 6, 10)));
    }
}
