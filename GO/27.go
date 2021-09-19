func removeElement(nums []int, val int) int {
	left := 0
	for _, right := range nums {
		if right != val {
			nums[left] = right
			left++
		}
	}
	return left
}