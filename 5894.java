class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set = new HashSet<>(), set1 = new HashSet<>(), set2 = new HashSet<>(), set3 = new HashSet<>();
        for(int i:nums1) {
            set1.add(i);
            set.add(i);
        }
        for(int i:nums2) {
            set2.add(i);
            set.add(i);
        }
        for(int i:nums3) {
            set3.add(i);
            set.add(i);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i:set) {
            int cur = 0;
            cur += set1.contains(i) ? 1:0;
            cur += set2.contains(i) ? 1:0;
            cur += set3.contains(i) ? 1:0;
            if(cur >= 2) ans.add(i);
        }
        return ans;
    }
}