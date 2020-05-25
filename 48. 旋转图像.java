class Solution {
    public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
        int n = matrix.length;
        int top = 0, bottom = n-1, left = 0, right = n-1;
        while(n > 1){
            for(int i = 0; i < n-1; i++){
                int temp = matrix[top][left + i];
                matrix[top][left+i] = matrix[bottom-i][left];
                matrix[bottom-i][left] = matrix[bottom][right-i];
                matrix[bottom][right-i] = matrix[top+i][right];
                matrix[top+i][right] = temp;
            }
            top++; bottom--;left++; right--;
            n = n - 2;
        }
    }
}