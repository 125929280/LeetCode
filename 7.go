func reverse(x int) int {
	var ans int
	for x != 0 {
		ans = ans*10 + x%10
		x /= 10
		if int(int32(ans)) != ans {
			return 0
		}
	}
	return ans
}