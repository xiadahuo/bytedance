class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums == null || k < 0 || k > nums.length) return 0;
        k = nums.length - k;
        findSmallest(nums, k, 0, nums.length-1);
        return nums[k];
    }
    public void findSmallest(int[] nums, int pos, int l, int r){
        while(l < r){
            int j = partition(nums, l, r);
            if(j == pos) break;
            else if(j > pos) r = j-1;
            else l = j+1;
        }
    }
    public int partition(int[] nums, int l, int r){
        int i = l, j = r;
        int pivot = nums[l];
        while(i < j){
            while(i < j && nums[j] >= pivot) j--;
            while(i < j && nums[i] <= pivot) i++;
            if(i < j){
                swap(nums, i, j);
            }
        }
        swap(nums, l, j);
        return j;
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}