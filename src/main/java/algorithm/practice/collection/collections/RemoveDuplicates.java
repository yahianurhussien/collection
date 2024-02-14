package algorithm.practice.collection.collections;

import java.util.Arrays;

public class RemoveDuplicates {


        public static int removeDuplicates(int[] nums) {


            int index = 1;
            int occurance = 1;

            for(int i=1; i < nums.length; i++){
                if (nums[i] == nums[i-1]){
                    occurance++;
                }else{
                    occurance = 1;
                }

                if (occurance <= 2){
                    nums[index] = nums[i];
                    index++;
                }
            }

            Arrays.stream(nums).forEach(System.out::print);
            return index;


        }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
    }
    }

