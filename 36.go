func isValidSudoku(board [][]byte) bool {
	var row, col [9][9]int
	var block [9][3][3]int

	for i, r := range board {
		for j, k := range r {
			if k == '.' {
				continue
			}
			cur := k - '1'

			if row[cur][i] > 0 {
				return false
			} else {
				row[cur][i]++
			}

			if col[cur][j] > 0 {
				return false
			} else {
				col[cur][j]++
			}

			if block[cur][i/3][j/3] > 0 {
				return false
			} else {
				block[cur][i/3][j/3]++
			}
		}
	}
	return true
}