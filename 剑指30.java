class MinStack {
    
    /** initialize your data structure here. */
    Deque<Integer> st1, st2;
    public MinStack() {
        st1 = new ArrayDeque<>();
        st2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        st1.push(x);
        if(st2.size() == 0 || x <= st2.peek()) st2.push(x);
    }
    
    public void pop() {
        if(st1.peek().equals(st2.peek())) st2.pop();
        st1.pop();
    }
    
    public int top() {
        return st1.peek();
    }
    
    public int min() {
        return st2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */