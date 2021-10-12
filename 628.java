class Solution {
    public int maximumProduct(int[] a) {
        Arrays.sort(a);
        int l = a.length;
        return Math.max(Math.max(a[0]*a[1]*a[2], a[l-1]*a[l-2]*a[l-3]), a[0]*a[1]*a[l-1]);
    }
}