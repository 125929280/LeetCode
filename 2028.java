class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int rollssum = 0;
        for(int i : rolls) rollssum += i;
        int sum = mean*(rolls.length + n) - rollssum;
        if(sum > n*6 || sum < n) return new int[0];
        int[] ans = new int[n];
        int avg = sum / n;
        for(int i = 0;i < n;i ++) {
            ans[i] = avg;
            sum -= avg;
        }
        int i = 0;
        while(sum != 0) {
            if(6-ans[i] <= sum) {
                sum -= 6-ans[i];
                ans[i] = 6;
            } else {
                ans[i] += sum;
                break;
            }
            i ++;
        }
        return ans;
    }
}