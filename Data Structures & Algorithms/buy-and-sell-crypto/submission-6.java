class Solution {
    public int maxProfit(int[] prices) {
        int maximum_profit =0;
        
        for (int i=0;i<prices.length;i++){
            for (int j=i+1 ;j<prices.length ; j++){
              int max=  prices[j]-prices[i];
               maximum_profit  = Math.max(maximum_profit,max);

            }
        }
        return maximum_profit;
    }
}
