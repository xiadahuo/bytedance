class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        if(intervals == null || intervals.length == 0 || intervals[0].length == 0) 
            return intervals;
        Arrays.sort(intervals, (int[] a, int[] b)->(a[0]-b[0]));
        res.add(intervals[0]);
        for(int i = 1; i < intervals.length; i++){
            int[] lastArray = res.get(res.size()-1);
            if(intervals[i][0] <= lastArray[1]) 
                lastArray[1] = Math.max(lastArray[1],intervals[i][1]);
            else{
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
}