func maxSubArray(nums []int) int {
	ans := nums[0]
	len := len(nums)
	for i := 1; i < len; i++ {
		if nums[i]+nums[i-1] > nums[i] {
			nums[i] = nums[i] + nums[i-1]
		}
		if nums[i] > ans {
			ans = nums[i]
		}
	}
	for _, v := range nums {
		fmt.Println(v)
	}
	return ans
}

//-2,1,-3,4,-1,2,1,-5,4
//-2,1,-2,4,3,5,6,1,5