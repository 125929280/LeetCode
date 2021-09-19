func longestCommonPrefix(strs []string) string {
	ans := strs[0]
	for _, str := range strs {
		for strings.Index(str, ans) != 0 {
			ans = ans[:len(ans)-1]
			if len(ans) == 0 {
				return ""
			}
		}
	}
	return ans
}