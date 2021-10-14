class Solution {
    public String reverseLeftWords(String s, int n) {
        // return s.substring(n, s.length()) + s.substring(0, n);
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for(int i = n;i < n + len;i ++) {
            sb.append(s.charAt(i % len));
        }
        return sb.toString();
    }
}