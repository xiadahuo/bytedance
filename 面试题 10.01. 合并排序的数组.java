class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        int total = m + n - 1;
        m--; n--;
        while(m >= 0 && n >= 0){
            if(A[m] < B[n]){
                A[total--] = B[n--];
            }else{
                A[total--] = A[m--];
            }
        }
        if(n >= 0){
            while(n >= 0) A[total--] = B[n--];
        }else{
            while(m >= 0) A[total--] = A[m--];
        }
    }
}