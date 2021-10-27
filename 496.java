class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // int l1 = nums1.length, l2 = nums2.length;
        // int[] ans = new int[l1];
        // for(int i = 0;i < l1;i ++) ans[i] = -1;
        // for(int i = 0;i < l1;i ++) {
        //     for(int j = 0;j < l2;j ++) {
        //         if(nums1[i] == nums2[j]) {
        //             int cur = j+1;
        //             while(cur < l2 && nums2[cur] <= nums1[i]) cur ++;
        //             ans[i] = cur == l2 ? -1:nums2[cur];
        //             break;
        //         }
        //     }
        //     // ans[i] = -1;
        // }
        // return ans;

        // 单调栈
        Deque<Integer> st = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = nums2.length-1;i >= 0;i --) {
            while(!st.isEmpty() && nums2[i] > st.peek()) st.pop();
            map.put(nums2[i], st.isEmpty() ? -1 : st.peek());
            st.push(nums2[i]);
        }
        int[] ans = new int[nums1.length];
        for(int i = 0;i < nums1.length;i ++) ans[i] = map.get(nums1[i]);
        return ans;
    }
}