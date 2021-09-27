class Solution {
    public void rotate(int[] nums, int k) {
        // 空间复杂度O(n)
        // int cur = 0, len = nums.length;
        // int[] tmp = new int[len];
        // for(int i = 0;i < len;i ++) {
        //     tmp[(i+k)%len] = nums[i];
        // }
        // for(int i = 0;i < len;i ++) {
        //     nums[i] = tmp[i];
        // }
        
        // 翻转数组
        // int len = nums.length;
        // k %= len;
        // reverse(nums, 0, len-1);
        // reverse(nums, 0, k-1);
        // reverse(nums, k, len-1);

        //环遍历+数学 ???
        int len = nums.length, count = gcd(len, k); 
        k %= len;
        for(int i = 0;i < count;i ++) {
            int cur = i, prev = nums[cur];
            do {
                int next = (cur+k)%len, tmp = nums[next];
                nums[next] = prev;
                prev = tmp;
                cur = next;
            } while(cur != i);
        }
    }

    public void reverse(int[] nums, int l, int r) {
        while(l < r) {
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l ++;
            r --;
        }
    }

    public int gcd(int a, int b) {
        return b == 0?a : gcd(b, a%b);
    }
}

// 1 2 3 4 5 6 7
// 7 6 5 4 3 2 1
// 5 6 7 4 3 2 1
// 5 6 7 1 2 3 4

//0->3->6->2->5->1->4->0

//a*n = b*k -> an = lcm(n, k) -> b = lcm(n, k)/k -> count = n/b = nk/lcm = gcd(n, k)