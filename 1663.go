func getSmallestString(n int, k int) string {
	ans := make([]byte, n)
	k -= n
	for i := n - 1; i >= 0; i-- {
		t := 0
		for k > 0 && t < 25 {
			k--
			t++
		}
		ans[i] = byte('a' + t)
	}
	return string(ans)
}