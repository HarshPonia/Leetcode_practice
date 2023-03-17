package Leetcode_75.Day_05;

public class _0121_Best_Tme_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        // int[] min = new int[n];
        // int[] max= new int[n];
        // min[0] = prices[0];
        // max[prices.length-1]=prices[prices.length-1];
        // for(int i =1;i<n;i++){
        //     min[i] = Math.min(min[i-1],prices[i]);
        // }
        // for(int i =n-1;i>=0;i--){
        //    max = Math.max(max[i+1],prices[i]);
        // }
        // int m = 0;
        // for(int i =0;i<n;i++){
        //       m = Math.max(max,max[i]-min[i]);
        // }

        // return m;
        int buy = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i =0;i<n;i++){
            if(prices[i]<buy){
                buy = prices[i];
            }
            maxprofit = Math.max(prices[i]-buy,maxprofit);
        }
        return maxprofit;
    }
}
