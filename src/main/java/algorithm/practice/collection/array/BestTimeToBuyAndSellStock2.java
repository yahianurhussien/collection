package algorithm.practice.collection.array;

public class BestTimeToBuyAndSellStock2 {



    public static int maxProfitEfficient(int[] prices){
        int profit = 0;
        for (int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){

                profit += (prices[i] - prices[i-1]);
            }
        }

        return profit;
    }
    public static int maxProfit(int[] prices){

        int profit = 0;
        int currentMin = prices[0];

        for (int i = 1; i < prices.length; i++){

            if(prices[i] < currentMin){
                currentMin = prices[i];
            }else{

                profit +=  prices[i] - currentMin;
                currentMin = prices[i];

            }
            }


        return profit;

        }


    public static void main(String[] args) {

        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{1,2,3,4,5}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
        System.out.println(".......................");
        System.out.println(maxProfitEfficient(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfitEfficient(new int[]{1,2,3,4,5}));
        System.out.println(maxProfitEfficient(new int[]{7,6,4,3,1}));


    }
}
