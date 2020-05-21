class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int ans = 0;
        for(int i = 0; i < left.length; i++){
            left[i] = ans;
            ans = Math.max(ans, height[i]);
        }
        ans = 0;
        for(int i = right.length-1; i >= 0; i--){
            right[i] = ans;
            ans = Math.max(ans, height[i]);
        }
        int res = 0;
        for(int i = 0; i < height.length; i++){
            int min = Math.min(left[i], right[i]);
            if(min > height[i]){
                res += min - height[i];
            }
        }
        return res;
    }
}