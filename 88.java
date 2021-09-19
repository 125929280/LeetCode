class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int i1 = 0,i2 = 0, cur = 0;
        while(cur < m+n && i1 < m && i2 < n) {
            if(nums1[i1] < nums2[i2]) ans[cur++] = nums1[i1++];
            else ans[cur++] = nums2[i2++];
        }
        while(i1 < m) ans[cur++] = nums1[i1++];
        while(i2 < n) ans[cur++] = nums2[i2++];
        for(int i = 0;i < m+n;i ++) nums1[i] = ans[i];
    }
}