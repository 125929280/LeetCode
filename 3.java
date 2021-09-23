class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int len = s.length(), l = 0, r = 0, ans = 0;
        while(r < len) {
            char c = s.charAt(r++);
            while(set.contains(c)) {
                set.remove(s.charAt(l++));
            }
            set.add(c);
            ans = Math.max(ans, r-l);
        }
        return ans;
    }
}