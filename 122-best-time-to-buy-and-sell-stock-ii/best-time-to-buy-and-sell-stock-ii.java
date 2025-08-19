class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxprofit = 0;
        for(int j=1; j<prices.length; j++){
            if(buy < prices[j]){
                maxprofit += prices[j] - buy;
            }
            buy = prices[j];
        }
        return maxprofit;
    }
}