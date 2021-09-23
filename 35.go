func searchInsert(nums []int, target int) int {
	// len := len(nums)
	// if len == 0 || target <= nums[0] {
	// 	return 0
	// }
	// for i, v := range nums {
	// 	if v >= target {
	// 		return i
	// 	}
	// }
	// return len

	//二分
	l, r, ans := 0, len(nums)-1, len(nums)
	for l <= r {
		m := l + (r-l)/2
		if target <= nums[m] {
			ans = m
			r = m - 1
		} else {
			l = m + 1
		}
	}
	return ans
}