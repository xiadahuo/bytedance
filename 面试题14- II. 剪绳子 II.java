class Solution {
    public int cuttingRope(int n) {
        if(n <= 3) return n-1;
        
        long res = 1;
        while(n > 4){
            res *= 3;
            n -= 3;
            res = res % 1000000007;
        }
        if(n == 4){
            res *= 4;
        }else if(n == 3){
            res *= 3;
        }else if(n == 2){
            res *= 2;
        }
        res = res % 1000000007;
        return (int)res;
    }
}