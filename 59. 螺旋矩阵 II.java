class Solution {
    public int[][] generateMatrix(int n) {
        if(n < 0) return null;
        int[][] res = new int[n][n];
        int top = 0, bottom = n-1, left = 0, right = n-1;
        int index = 1;
        while(top <= bottom && left <= right){
            if(top == bottom){
                for(int i = left; i <= right; i++){
                    res[top][i] = index++;
                }
            }else if(left == right){
                for(int i = top; i <= bottom; i++){
                    res[i][left] = index++;
                }
            }else{
                for(int i = left; i < right; i++){
                    res[top][i] = index++;
                }
                for(int i = top; i < bottom; i++){
                    res[i][right] = index++;
                }
                for(int i = right; i > left; i--){
                    res[bottom][i] = index++;
                }
                for(int i = bottom; i > top; i--){
                    res[i][left] = index++;
                }
            }
            top++; bottom--; left++; right--;
        }
        return res;
    }
}