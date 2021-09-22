func champagneTower(poured int, query_row int, query_glass int) float64 {
	dp := make([][]float64, 105)
	for i := 0; i < 105; i++ {
		dp[i] = make([]float64, 105)
	}
	dp[0][0] = float64(poured)
	for i := 0; i <= query_row; i++ {
		for j := 0; j <= i; j++ {
			if dp[i][j] > 1 {
				dp[i+1][j] += (dp[i][j] - 1.0) / 2.0
				dp[i+1][j+1] += (dp[i][j] - 1.0) / 2.0
			}
		}
	}
	return min(1.0, dp[query_row][query_glass])
}

func min(a, b float64) float64 {
	if a < b {
		return a
	} else {
		return b
	}
}

/*
0
0 0
0 0 0
0 0 0 0
0 0 0 0 0
*/