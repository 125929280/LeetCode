func strStr(haystack string, needle string) int {
	l1 := len(haystack)
	l2 := len(needle)
	if l2 == 0 {
		return 0
	}
	if l1 < l2 {
		return -1
	}
	for i := 0; i+l2 <= l1; i++ {
		flag := true
		for j, _ := range needle {
			if haystack[i+j] != needle[j] {
				flag = false
				break
			}
		}
		if flag {
			return i
		}
	}
	return -1
}