func isValid(s string) bool {
	if len(s) <= 1 {
		return false
	}
	stack := []byte{}
	stack = append(stack, s[0])
	for i := 1; i < len(s); i++ {
		if len(stack) == 0 || s[i] == '(' || s[i] == '[' || s[i] == '{' {
			stack = append(stack, s[i])
		} else {
			if s[i] == ')' && stack[len(stack)-1] != '(' {
				return false
			}
			if s[i] == ']' && stack[len(stack)-1] != '[' {
				return false
			}
			if s[i] == '}' && stack[len(stack)-1] != '{' {
				return false
			}
			stack = stack[:len(stack)-1]
		}
	}
	return len(stack) == 0
}