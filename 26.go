func removeDuplicates(nums []int) int {
	len := len(nums)
	if len <= 1 {
		return len
	}

	slow := 1
	for fast := 1; fast < len; fast++ {
		if nums[fast-1] != nums[fast] {
			nums[slow] = nums[fast]
			slow++
		}
	}
	return slow
}