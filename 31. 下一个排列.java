class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1) return;
        int n = nums.length-2;
        while(n >= 0){
            if(nums[n] >= nums[n+1]) n--;
            else break;
        }
        if(n == -1) {
            reverse(nums, 0, nums.length-1);
        } else{
            int m = nums.length-1;
            while(nums[m] <= nums[n]) m--;
            swap(nums, n, m);
            reverse(nums, n+1, nums.length-1);
        }
    }

// 14653    15346
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums, int i, int j){
        while(i < j){
            swap(nums, i++, j--);
        }
    }
}