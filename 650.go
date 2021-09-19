func minSteps(n int) int {
	//分解质因数
	// ans := 0
	// for i:= 2;i <= n;i ++ {
	//     for n%i == 0 {
	//         ans += i
	//         n /= i
	//     }
	// }
	// return ans

	//dp
	f := make([]int, n+1)
	for i := 2; i <= n; i++ {
		f[i] = math.MaxInt32
		for j := 1; j*j <= i; j++ {
			if i%j == 0 {
				f[i] = min(f[i], f[j]+i/j)
				f[i] = min(f[i], f[i/j]+j)
			}
		}
	}
	return f[n]
}

func min(a, b int) int {
	if a < b {
		return a
	} else {
		return b
	}
}