func searchInsert(nums []int, target int) int {
	len := len(nums)
	if len == 0 || target <= nums[0] {
		return 0
	}
	for i, v := range nums {
		if v >= target {
			return i
		}
	}
	return len
}