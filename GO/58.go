func lengthOfLastWord(s string) int {
	i := len(s) - 1
	ans := 0
	for ; i >= 0; i-- {
		if s[i] != ' ' {
			break
		}
	}
	for ; i >= 0 && s[i] != ' '; i-- {
		ans++
	}
	return ans
}