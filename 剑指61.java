class Solution {
    public boolean isStraight(int[] nums) {
        int[] bits = new int[14];
        int min = 14, max = 0;
        for(int i:nums) {
            if(i != 0 && bits[i] != 0) return false;
            bits[i] ++;
            if(i == 0) continue;
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return max-min <= 4;
    }
}