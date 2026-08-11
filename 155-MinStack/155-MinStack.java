// Last updated: 11/08/2026, 18:52:14
class MinStack {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public MinStack() {
    }
    public void push(int val) {
        s.push(val);
        if (min.isEmpty() || val <= min.peek())
            min.push(val);
    }
    public void pop() {
        if (s.peek().equals(min.peek()))
            min.pop();
        s.pop();
    }
    public int top() {
        return s.peek();
    }
    public int getMin() {
        return min.peek();
    }
}