func maxProfit(prices []int) int {
	min_price := prices[0]
	max_profit := 0
	for _, v := range prices {
		max_profit = max(max_profit, v-min_price)
		min_price = min(min_price, v)
	}
	return max_profit
}

func max(a, b int) int {
	if a > b {
		return a
	} else {
		return b
	}
}

func min(a, b int) int {
	if a < b {
		return a
	} else {
		return b
	}
}