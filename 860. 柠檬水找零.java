class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n5 = 0, n10 = 0, n20 = 0;
        for(int n : bills){
            if(n == 5){
                n5++;
            }else if(n == 10){
                if(n5 == 0) return false;
                n5--;
                n10++;
            }else{
                if(n10 > 0){
                    n10--;
                    n5--;
                    if(n5 < 0) return false;
                }else{
                    n5 -= 3;
                    if(n5 < 0) return false;
                }
                n20++;
            }
        }
        return true;
    }
}