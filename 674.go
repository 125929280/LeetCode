func findLengthOfLCIS(nums []int) int {
	l := len(nums)
	dp := make([]int, l)
	ans := 1
	dp[0] = 1
	for i := 1; i < l; i++ {
		dp[i] = 1
		if nums[i] > nums[i-1] {
			dp[i] = dp[i-1] + 1
		}
		ans = max(ans, dp[i])
	}
	return ans
}

func max(a, b int) int {
	if a > b {
		return a
	} else {
		return b
	}
}