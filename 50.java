class Solution {
    public double myPow(double x, int n) {
        return n >= 0 ? quickPow(x, n) : 1.0/quickPow(x, -n);
    }
    public double quickPow(double x, int n) {
        if(n == 0) return 1.0;
        double y = quickPow(x, n/2);
        return n%2 == 0 ? y*y : y*y*x;
    }
}