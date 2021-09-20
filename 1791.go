func findCenter(edges [][]int) int {
	a, b := edges[0][0], edges[0][1]
	for i := 1; i < len(edges); i++ {
		if a != edges[i][0] && a != edges[i][1] {
			return b
		}
		if b != edges[i][0] && b != edges[i][1] {
			return a
		}
	}
	return 0
}