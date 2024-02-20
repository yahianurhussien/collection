package algorithm.practice.interview;

import javax.xml.stream.events.Comment;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrangeWeights {

    public static int minNumberOfSwaps(List<Integer> arr){

        int minIndex = Integer.MIN_VALUE;
        int maxIndex = Integer.MAX_VALUE;
        int count = 0;

        Integer min  = Collections.min(arr);
        Integer max = Collections.max(arr);

        for (int i = 0; i < arr.size(); i++) {

            if(min ==  arr.get(i)){
                minIndex = i;
            }
        }


        for(int i = minIndex ; i > 0; i--){
            int temp = arr.get(i);
            arr.set(i, arr.get(i-1));
            arr.set(i-1, temp);
            count++;
        }



        for (int i = 0; i < arr.size(); i++) {

            if(max  ==  arr.get(i)){
                maxIndex= i;
            }
        }

        for(int i = maxIndex ; i < arr.size()-1; i++){
            int temp = arr.get(i);
            arr.set(i, arr.get(i+1));
            arr.set(i+1, temp);
            count++;
        }


        return count;


    }

    public static void main(String[] args) {
        System.out.println(minNumberOfSwaps(Arrays.asList(2,4,3,1)));
        System.out.println(minNumberOfSwaps(Arrays.asList(2,4,3,1,6)));
        System.out.println(minNumberOfSwaps(Arrays.asList(3,2,1)));

    }
}
