class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=Integer.MIN_VALUE;
        int buyPriceSoFar=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
          buyPriceSoFar=Math.min(buyPriceSoFar,prices[i]);
          maxProfit=Math.max(maxProfit,prices[i]-buyPriceSoFar);
        }
        return maxProfit;
    }
}
