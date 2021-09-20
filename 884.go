func uncommonFromSentences(s1 string, s2 string) []string {
	ans := []string{}
	m := make(map[string]int)
	word1, word2 := strings.Split(s1, " "), strings.Split(s2, " ")
	for _, word := range word1 {
		m[word]++
	}
	for _, word := range word2 {
		m[word]++
	}
	for k, v := range m {
		if v == 1 {
			ans = append(ans, k)
		}
	}
	return ans
}