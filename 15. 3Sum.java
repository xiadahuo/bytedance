class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length < 3) return res;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i != 0 && nums[i] == nums[i-1]) continue;
            int sum = - nums[i];
            int l = i+1, r = nums.length-1;
            while(l < r){
                if(nums[l] + nums[r] == sum) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    while(l < r && nums[l] == nums[l+1]) l++;
                    while(l < r && nums[r] == nums[r-1]) r--;
                    l++;r--;
                }else if(nums[l] + nums[r] < sum){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return res;
    }
}