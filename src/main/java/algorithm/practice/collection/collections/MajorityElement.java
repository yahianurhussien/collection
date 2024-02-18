package algorithm.practice.collection.collections;

import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
        System.out.println(majorityElementEfficient(new int[]{2,2,3,3,3,3,2}));
    }

    private static int majorityElement(int[] nums) {
        int majoritySize = nums.length / 2;

        Arrays.sort(nums);
        int start = nums[1];
        int count  = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            if (count > majoritySize){
                return nums[i];
            }
        }
     return 0;
    }

    private static int majorityElementEfficient(int[] nums){
       Arrays.sort(nums);

       return nums[nums.length / 2];



    }
}
