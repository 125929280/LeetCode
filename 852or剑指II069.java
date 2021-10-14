class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // for(int i = 0;i < arr.length-1;i ++) if(arr[i] > arr[i+1]) return i;
        // return 0;
        int l = 1, r = arr.length-2, ans = r;
        while(l <= r) {
            int m = (l+r)/2;
            if(arr[m] > arr[m+1]) {
                ans = m;
                r = m-1;
            } else {
                l = m+1;
            }
        }
        return ans;
    }
}