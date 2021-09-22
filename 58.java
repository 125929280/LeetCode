class Solution {
    public int lengthOfLastWord(String s) {
        int ans = 0, i;
        for(i = s.length()-1;i >= 0;i --) {
            if(s.charAt(i) != ' ') break;
        }
        while(i >= 0 && s.charAt(i) != ' ') {
            i --;
            ans ++;
        }
        return ans;
    }
}