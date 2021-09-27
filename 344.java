class Solution {
    public void reverseString(char[] s) {
        int len = s.length, l = 0, r = len-1;
        while(l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l ++;
            r --;
        }
    }
}