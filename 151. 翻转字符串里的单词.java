class Solution {
    public String reverseWords(String s) {
        if(s == null) return null;
        char[] a = s.toCharArray();
        int n = a.length;

        //1.reverse the whole string
        reverse(a, 0, n-1);
        //2.reverse each word
        reverseWords( a, n);
        //3. clean up spaces
        return cleanSpaces(a, n);
    }

    public void reverseWords(char[] a, int n){
        int i = 0, j = 0;
        while(i < n){
            while(i < j || i < n && a[i] == ' ') i++; //skip spaces
            while(j < i || j < n && a[j] != ' ') j++; //skip non spaces
            reverse(a, i, j-1);                       //reverse the word
        }
    }
    
    String cleanSpaces(char[] a, int n){
        int i = 0, j = 0;
        while(j < n){
            while(j < n && a[j] == ' ') j++;
            while(j < n && a[j] != ' ') a[i++] = a[j++];
            while(j < n && a[j] == ' ') j++;
            if(j < n) a[i++] = ' ';
        }
        return new String(a).substring(0,i);
    }


    public void reverse(char[] a, int i, int j){
        while(i < j){
            char t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }
    }
}