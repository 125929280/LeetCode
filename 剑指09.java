class CQueue {
    Deque<Integer> st1, st2;
    public CQueue() {
        st1 = new LinkedList<>();
        st2 = new LinkedList<>();
    }
    
    public void appendTail(int value) {
        st1.push(value);
    }
    
    public int deleteHead() {
        if(st2.size() == 0) {
            while(st1.size() != 0) {
                st2.push(st1.peek());
                st1.pop();
            }
        }
        if(st2.size() == 0) return -1;
        int ans = st2.peek();
        st2.pop();
        return ans;
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */