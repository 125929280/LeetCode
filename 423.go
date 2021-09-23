func originalDigits(s string) string {
	//ans := make(char[], 0)
	var ans string = ""
	hashmap := make(map[byte]int)
	for i := 0; i < len(s); i++ {
		hashmap[s[i]]++
	}
	num := make([]int, 10)
	num[0] = hashmap['z']
	num[2] = hashmap['w']
	num[6] = hashmap['x']
	num[8] = hashmap['g']
	//num[1] = hashmap['o'] - num[0] - num[2]
	num[3] = hashmap['t'] - num[2] - num[8]
	num[7] = hashmap['s'] - num[6]
	num[4] = hashmap['r'] - num[0] - num[3]
	num[5] = hashmap['f'] - num[4]
	num[1] = hashmap['o'] - num[0] - num[2] - num[4]
	num[9] = (hashmap['n'] - num[1] - num[7]) / 2

	for i := 0; i < 10; i++ {
		for num[i] > 0 {
			num[i]--
			ans += strconv.Itoa(i)
		}
	}
	return ans
}