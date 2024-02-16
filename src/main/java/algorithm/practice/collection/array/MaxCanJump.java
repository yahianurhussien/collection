package algorithm.practice.collection.array;

public class MaxCanJump {
    private static int maxJumpLength(int[] nums){
        int  count  = 0;
        int reacheable = 0;

        for ( int i = 0; i < nums.length; i++){
            if (i > reacheable){
                break;
            }
            else {
                reacheable = Math.max(reacheable, i + nums[i]);
                count++;
            }
        }

        return count;


    }
    private static boolean canJump(int[] nums){
        int reacheable = 0;

        for ( int i = 0; i < nums.length; i++){
            if (i > reacheable){
                return false;
            }
            else {
                reacheable = Math.max(reacheable, i + nums[i]);
            }
        }

        return true;

        }
    private static int move(int[] nums){

        int jumps = 0, currEnd = 0, currFarthest = 0;
        for(int i = 0; i < nums.length - 1; i ++) {
            currFarthest = Math.max(currFarthest, i + nums[i]);
            if(i == currEnd) {
                currEnd = currFarthest;
                jumps ++;
            }
        }
        return jumps;
    }
    public static void main(String[] args) {
        System.out.println(canJump(new int[] {2,3,1,1,4}));
        System.out.println(maxJumpLength(new int[] {2,3,1,1,4}));
        System.out.println(move(new int[] {2,3,1,1,4}));


    }
}
