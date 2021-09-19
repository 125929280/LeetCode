func compressString(S string) string {
	if len(S) == 0 {
		return S
	}
	l := len(S)
	ans := make([]byte, 0, l)
	cur := S[0]
	cur_cnt := 1

	for i := 1; i < l; i++ {
		if S[i] != cur {
			ans = append(ans, cur)
			ans = append(ans, []byte(strconv.Itoa(cur_cnt))...)
			cur = S[i]
			cur_cnt = 1
		} else {
			cur_cnt++
		}
	}
	ans = append(ans, cur)
	ans = append(ans, []byte(strconv.Itoa(cur_cnt))...)
	if l <= len(ans) {
		return S
	}
	return string(ans)
}