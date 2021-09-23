func permutation(S string) []string {
	ans := make([]string, 0)
	var cur []byte
	visit := make([]bool, len(S))
	var dfs func()
	dfs = func() {
		if len(cur) == len(S) {
			ans = append(ans, string(cur))
		}
		for i := 0; i < len(S); i++ {
			if visit[i] == false {
				visit[i] = true
				cur = append(cur, S[i])
				dfs()
				visit[i] = false
				cur = cur[:len(cur)-1]
			}
		}
	}
	dfs()
	return ans
}