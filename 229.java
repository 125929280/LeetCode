class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // hash
        // int n = nums.length;
        // Map<Integer, Integer> map = new HashMap<>();
        // List<Integer> ans = new ArrayList<>();
        // for(int i:nums) {
        //     map.put(i, map.getOrDefault(i, 0)+1);
        // }
        // for(int i:map.keySet()) {
        //     if(map.get(i) > n/3) ans.add(i);
        // }
        // return ans;

        // 摩尔投票
        int n = nums.length;
        int num1 = 0, num2 = 0, count1 = 0, count2 = 0;
        for(int i:nums) {
            if(count1 != 0 && num1 == i) count1 ++;
            else if(count2 != 0 && num2 == i) count2 ++;
            else if(count1 == 0) {
                count1 ++;
                num1 = i;
            } else if(count2 == 0) {
                count2 ++;
                num2 = i;
            } else if(num1 != i && num2 != i) {
                count1 --;
                count2 --;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i:nums) {
            if(num1 == i) count1 ++;
            else if(num2 == i) count2 ++;
        }
        List<Integer> ans = new ArrayList<>();
        if(count1 > n/3) ans.add(num1);
        if(count2 > n/3) ans.add(num2);
        return ans;
    }
}