class Solution {
    public int[] constructRectangle(int area) {
        for(int l = (int)Math.sqrt(area);l >= 1;l --) {
            if(area % l == 0) return new int[]{area/l, l};
        }
        return new int[]{area, 1};
    }
}