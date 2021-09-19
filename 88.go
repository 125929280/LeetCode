func merge(nums1 []int, m int, nums2 []int, n int) {
	ans := make([]int, 0, m+n)
	i1, i2 := 0, 0
	for i1 < m && i2 < n {
		if nums1[i1] < nums2[i2] {
			ans = append(ans, nums1[i1])
			i1++
		} else {
			ans = append(ans, nums2[i2])
			i2++
		}
	}
	for i1 < m {
		ans = append(ans, nums1[i1])
		i1++
	}
	for i2 < n {
		ans = append(ans, nums2[i2])
		i2++
	}
	for i, v := range ans {
		nums1[i] = v
	}
}