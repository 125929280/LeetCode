func twoSum(nums []int, target int) []int {
	//双重循环
	// for i := 0; i < len(nums); i++ {
	//     for j := i+1; j < len(nums); j++ {
	//         if nums[i] + nums[j] == target {
	//             return []int{i, j}
	//         }
	//     }
	// }
	// return []int{0, 0}

	//hash
	hashTable := map[int]int{}
	for index1, value1 := range nums {
		index2, ok := hashTable[value1]
		if ok {
			return []int{index1, index2}
		}
		hashTable[target-value1] = index1
	}
	return []int{}
}