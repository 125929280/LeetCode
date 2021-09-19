func addBinary(a string, b string) string {
	ans := ""
	lena, lenb := len(a), len(b)
	len := max(lena, lenb)
	cur := 0
	for i := 0; i < len; i++ {
		if i < lena {
			cur += int(a[lena-i-1] - '0')
		}
		if i < lenb {
			cur += int(b[lenb-i-1] - '0')
		}
		ans = strconv.Itoa(cur%2) + ans
		cur /= 2
	}
	if cur > 0 {
		ans = "1" + ans
	}
	return ans
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}