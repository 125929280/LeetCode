class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums) {
            if(set.contains(i)) return i;
            set.add(i);
        }
        return 0;
    }
}