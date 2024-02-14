package algorithm.practice.collection.array;

import java.text.CollationElementIterator;
import java.util.Arrays;
import java.util.Collections;

public class RotateArray {

    public static void rotateCostly(int[] nums, int k) {
        int rotation  = 0;
        while(rotation < k){
            int lastElement = nums[nums.length - 1];

            for (int i =nums.length - 1; i > 0; i--){
                nums[i] = nums[i-1];
            }
            nums[0] = lastElement;

            rotation++;


        }

        System.out.println(Arrays.toString(nums));

    }

    private static void rotateEfficientNewMemory(int[] nums, int k){

        int[] newArray = new int[nums.length];

        for ( int i =0; i < nums.length; i++){
            newArray[((i+k) % nums.length)] = nums[i];
        }

        nums = newArray;

        System.out.println(Arrays.toString(nums));

    }
    private static void rotateEfficientInLine(int[] nums, int k) {

        k = k % nums.length;
        if(k < 0){
            k += nums.length;
        }

        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums, 0,nums.length-k-1);
        reverse(nums, 0, nums.length-1);

//        int[] first = Arrays.copyOf(nums,nums.length -k);
//        int[] second = new int[k];
//       for (int i = 0;i < k; i++){
//           second[i] = nums[nums.length-1-i];
//       }
//
//
//        System.arraycopy(second,0,nums,0,second.length);
//        System.arraycopy(first,0,nums,second.length,first.length);
//
//
        System.out.println(Arrays.toString(nums));



    }
    public static void reverse(int nums[], int i, int j){
        int li = i;
        int ri = j;

        while(li < ri){
            int temp = nums[li];
            nums[li] = nums[ri];
            nums[ri] = temp;

            li++;
            ri--;
        }
    }




    // main
    public static void main(String[] args) {
//        rotateCostly(new int[]{1,2,3,4,5,6,7}, 3);
//        rotateEfficientInLine(new int[]{1,2,3,4,5,6,7}, 3);
          rotateEfficientNewMemory(new int[]{1,2,3,4,5,6,7}, 3);
    }


}
