class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] t = new int[timePoints.size()];
        for(int i = 0;i < timePoints.size();i ++) {
            String[] ss = timePoints.get(i).split(":");
            t[i] = Integer.parseInt(ss[0])*60 + Integer.parseInt(ss[1]);
        }
        Arrays.sort(t);
        int ans = t[0] + 24*60 - t[t.length - 1];
        for(int i = 0;i < t.length-1;i ++) {
            ans = Math.min(ans, t[i+1]-t[i]);
        }
        return ans;
    }
}