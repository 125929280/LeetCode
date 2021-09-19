func climbStairs(n int) int {
	if n <= 2 {
		return n
	}
	ans := make([]int, n+1)
	ans[1] = 1
	ans[2] = 2
	for i := 3; i <= n; i++ {
		ans[i] = ans[i-1] + ans[i-2]
	}
	return ans[n]
}