class MinStack {

    /** initialize your data structure here. */
    int min;
    ArrayList<Integer> arr;
    public MinStack() {
        arr = new ArrayList<>();
        //min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        arr.add(x);
        /*if (x<min) {
            min=x;
        }*/
    }
    
    public void pop() {
        arr.remove(arr.size()-1);
        
    }
    
    public int top() {
        return arr.get(arr.size()-1);
    }
    
    public int getMin() {
        min = arr.get(0);
        for (int i=1;i<arr.size();i++) {
            if (arr.get(i)<min) {
                min = arr.get(i);
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
