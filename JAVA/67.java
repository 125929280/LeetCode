class Solution {
    public String addBinary(String a, String b) {
        StringBuffer ans = new StringBuffer();
        int lena = a.length(), lenb = b.length();
        int len = Math.max(lena, lenb);
        int cur = 0;
        for(int i = 0;i < len;i ++) {
            if(i < lena) {
                cur += a.charAt(lena- i - 1) - '0';
            }
            if(i < lenb) {
                cur += b.charAt(lenb- i - 1) - '0';
            }
            ans.insert(0, (char)(cur%2 + '0'));
            cur /= 2;
        }
        if(cur > 0) {
            ans.insert(0, '1');
        }
        return ans.toString();
    }
}