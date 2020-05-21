class Solution {
    public int maxProfit(int k, int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        if(k > prices.length/2) return greedy(prices);
        int[][][] dp = new int[prices.length][2][k+1]; //第几天，第几次交易，持有不持有，
        //买一次交易+1 
        for(int i = 0; i <= k; i++){
            dp[0][1][i] = -prices[0];
        }
        for(int i = 1; i < prices.length; i++){
            for(int j = 1; j < k+1; j++){
                dp[i][0][j] = Math.max(dp[i-1][0][j], dp[i-1][1][j] + prices[i]);
                dp[i][1][j] = Math.max(dp[i-1][0][j-1] - prices[i], dp[i-1][1][j]);
            }
        } 
        int max = 0;
        for(int i = 0; i <= k; i++){
            max = Math.max(max, dp[prices.length-1][0][k]);
        }
        return max;
    }
    public int greedy(int[] nums){
        int res = 0;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i+1] > nums[i])
                res += nums[i+1]-nums[i];
        }
        return res;
    }
}