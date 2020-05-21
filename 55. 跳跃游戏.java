class Solution {
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        int dis = 0;
        for(int i = 0; i < nums.length && dis >= i; i++){
            dis = Math.max(dis, nums[i]+i);
        }
        return dis >= nums.length-1;
    }
}