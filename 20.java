class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0;i < s.length();i ++) {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }else if(c == ')') {
                if(stack.size() != 0 && stack.peek() == '(') stack.pop();
                else return false;
            }else if(c == ']') {
                if(stack.size() != 0 && stack.peek() == '[') stack.pop();
                else return false;
            }else {
                if(stack.size() != 0 && stack.peek() == '{') stack.pop();
                else return false;
            }
        }
        return stack.size() == 0;
    }
}