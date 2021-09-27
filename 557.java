class Solution {
    public String reverseWords(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = 0, len = c.length;
        for(; j < len; j ++) {
            if(c[j] == ' ') {
                reverse(c, i, j-1);
                i = j+1;
            }
            if(j == len-1) {
                reverse(c, i, j);
            }
        }
        return new String(c);
    }

    public void reverse(char[] c,  int l, int r) {
        while(l < r) {
            char temp = c[l];
            c[l] = c[r];
            c[r] = temp;
            l ++;
            r --;
        }
    }
}