func isPowerOfThree(n int) bool {
	//递归
	// if n == 1 {
	//     return true
	// }
	// if n <= 0 || n % 3 != 0 {
	//     return false
	// }
	// return isPowerOfThree(n/3)

	//循环
	for ; n > 0 && n%3 == 0; n /= 3 {
	}
	return n == 1
}