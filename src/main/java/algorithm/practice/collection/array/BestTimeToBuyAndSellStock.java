package algorithm.practice.collection.array;

public class BestTimeToBuyAndSellStock {

    static  int maxProf = 0;
    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfitEfficient(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfitEfficient1(new int[]{7,1,5,3,6,4}));

    }

    private static int maxProfitEfficient1(int[] prices){
        int leastSoFar = Integer.MAX_VALUE;
        int overAllProfit = 0;
        int profitSellToday = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < leastSoFar){
                leastSoFar = prices[i];
            }
            profitSellToday = prices[i] - leastSoFar;
            if(overAllProfit < profitSellToday){
                overAllProfit = profitSellToday;
            }
        }
        return overAllProfit;
    }

    private static int maxProfitEfficient(int[] prices){

        int n = prices.length;
        int profit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < n; ++i) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                profit = Math.max(profit, prices[i] - minPrice);
            }
        }

        return profit;
    }

    private static int maxProfit(int[] prices) {


         for (int i = 0; i < prices.length-1; i++){

             int currentDayPrice = prices[i];
             int largest = largest(prices, prices.length , i+1);
             int profit = largest - currentDayPrice;
             if (profit > 0 && profit > maxProf ){
                 maxProf  = profit;
             }
         }

         return maxProf;
         }




    static int largest(int[] arr, int n, int i)
    {
        // Last index return the element
        if (i == n - 1) {
            return arr[i];
        }

        // Find the maximum from rest of the array
        int recMax = largest(arr, n, i + 1);

        // Compare with i-th element and return
        return Math.max(recMax, arr[i]);
    }

}
