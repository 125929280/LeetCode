func isPalindrome(x int) bool {
    if x < 0 {
        return false
    }
	//常规
    // var ori = x
    // var temp int
    // for x != 0 {
    //     temp = temp*10 + x%10
    //     x /= 10
    // }
    // return temp == ori

	//2-points
    list := []int {}
    for x != 0 {
        list = append(list, x%10)
        x /= 10
    }
    for i := 0; i < (len(list)+1)/2; i++ {
        if list[i] != list[len(list)-i-1] {
            return false
        }
    }
    return true
}