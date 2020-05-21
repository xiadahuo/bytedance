class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1 == null || s2 == null) return false;
        int len1 = s1.length(), len2 = s2.length();
        if(len1 > len2) return false;
        int[] cnt = new int[26];
        for(int i = 0; i < len1; i++){
            cnt[s1.charAt(i)-'a']++;
        }
        for(int i = 0; i < len2; i++){
            cnt[s2.charAt(i)-'a']--;
            if(i >= len1) cnt[s2.charAt(i-len1)-'a']++;
            if(Allzero(cnt)) return true;
        }
        return false;
    }

    public boolean Allzero(int[] cnt){
        for(int i = 0; i < cnt.length; i++){
            if(cnt[i] != 0) return false;
        }
        return true;
    }
}