class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int remain = 0;
        int total = 0;
        int start = 0;
        for(int i = 0; i < gas.length; i++){
            total = total + gas[i] - cost[i];
            remain += gas[i] - cost[i];
            if(remain < 0) {
                start = i + 1;
                remain = 0;
            }
        }
        return total >= 0 ? start : -1; 
    }
}