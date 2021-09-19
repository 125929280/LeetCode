func romanToInt(s string) int {
	var ans int
	hashMap := map[byte]int{}
	hashMap['I'] = 1
	hashMap['V'] = 5
	hashMap['X'] = 10
	hashMap['L'] = 50
	hashMap['C'] = 100
	hashMap['D'] = 500
	hashMap['M'] = 1000
	for i := 0; i < len(s); i++ {
		if i < len(s)-1 && hashMap[s[i]] < hashMap[s[i+1]] {
			ans -= hashMap[s[i]]
		} else {
			ans += hashMap[s[i]]
		}
	}
	return ans
}