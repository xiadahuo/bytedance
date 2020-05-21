class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int res = 0;
        //后一天比前一天贵就买卖赚差价 峰谷
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i+1] > prices[i]){
                res += prices[i+1]-prices[i];
            }
        }
        return res;
    }
}