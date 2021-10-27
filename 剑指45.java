class Solution {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0;i < nums.length;i ++) strs[i] = nums[i] + "";
        Arrays.sort(strs, new Comparator<String>() {
            public int compare(String t1, String t2) {
                return (t1 + t2).compareTo(t2 + t1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for(String s:strs) sb.append(s);
        return sb.toString();
    }
}