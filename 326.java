class Solution {
    public boolean isPowerOfThree(int n) {
        //递归
        // if(n == 1) return true;
        // if(n == 0) return false;
        // return n%3 == 0 ? isPowerOfThree(n/3) : false;
        
        //循环
        while(n > 0 && n%3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}