func selfDividingNumbers(left int, right int) []int {
	ans := []int{}
	for i := left; i <= right; i++ {
		if helper(i) {
			ans = append(ans, i)
		}
	}
	return ans
}

func helper(n int) bool {
	cur := n
	for cur != 0 {
		if cur%10 == 0 || n%(cur%10) != 0 {
			return false
		} else {
			cur /= 10
		}
	}
	return true
}