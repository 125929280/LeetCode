class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length(), l2 = s2.length();
        if(l1 > l2) return false;
        int[] nums = new int[26];
        for(int i = 0; i < l1; i ++) {
            nums[s1.charAt(i) - 'a'] --;
            nums[s2.charAt(i) - 'a'] ++;
        }
        int diff = 0;
        for(int i : nums) {
            if(i != 0) diff ++;
        }
        if(diff == 0) return true;
        for(int i = l1; i < l2; i ++) {
            // i-l1 i
            int cur1 = s2.charAt(i-l1) - 'a', cur2 = s2.charAt(i) - 'a';
            if(cur1 == cur2) continue;
            nums[cur1] --;
            if(nums[cur1] == 0) diff --;
            else if(nums[cur1] == -1) diff ++;

            nums[cur2] ++;
            if(nums[cur2] == 0) diff --;
            else if(nums[cur2] == 1) diff ++;

            if(diff == 0) return true;
        }
        return false;
    }
}