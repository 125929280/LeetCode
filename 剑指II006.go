func twoSum(numbers []int, target int) []int {
	l := len(numbers)
	i, j := 0, l-1
	for i < j && i < l && j >= 0 {
		if numbers[i]+numbers[j] == target {
			return []int{i, j}
		} else if numbers[i]+numbers[j] < target {
			i++
		} else {
			j--
		}
	}
	return []int{}
}