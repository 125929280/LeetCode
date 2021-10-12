class MinStack {
    Deque<Integer> st1, st2;
    public MinStack() {
        st1 = new LinkedList<>();
        st2 = new LinkedList<>();
    }
    
    public void push(int val) {
        if(st2.size() == 0 || val <= st2.peek()) st2.push(val);
        st1.push(val);
    }
    
    public void pop() {
        if(st1.peek().equals(st2.peek())) st2.pop();
        st1.pop();
    }
    
    public int top() {
        return st1.peek();
    }
    
    public int getMin() {
        return st2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */