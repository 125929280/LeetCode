class Solution {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length(), l2 = needle.length();
        if(l2 == 0) return 0;
        if(l1 < l2) return -1;
        for(int i = 0; i + l2 <= l1; i ++) {
            boolean flag = true;
            for(int j = 0; j < l2; j ++) {
                if(haystack.charAt(i+j) != needle.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if(flag) return i;
        }
        return -1;
    }
}