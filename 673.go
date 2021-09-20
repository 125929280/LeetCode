func findNumberOfLIS(nums []int) int {
	l, max_l, ans := len(nums), 0, 0
	dp := make([]int, l)
	cnt := make([]int, l)

	for i := 0; i < l; i++ {
		dp[i] = 1
		cnt[i] = 1
		for j := 0; j < i; j++ {
			if nums[i] > nums[j] {
				if dp[j]+1 > dp[i] {
					dp[i] = dp[j] + 1
					cnt[i] = cnt[j]
				} else if dp[j]+1 == dp[i] {
					cnt[i] += cnt[j]
				}
			}
		}
		max_l = max(max_l, dp[i])
	}
	for i := 0; i < l; i++ {
		if dp[i] == max_l {
			ans += cnt[i]
		}
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