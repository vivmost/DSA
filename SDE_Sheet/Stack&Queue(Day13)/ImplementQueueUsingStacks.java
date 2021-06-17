class MyQueue {
    Stack<Integer> input = new Stack();
    Stack<Integer> output = new Stack();
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        input.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        // shift input to output 
        if (output.empty())
            while (input.empty() == false)
            {
                output.push(input.peek());
                input.pop();     
            }
                

        int x = output.peek();
        output.pop(); 
        return x; 
    }
    
    /** Get the front element. */
    public int peek() {
         // shift input to output 
        if (output.empty())
            while (input.empty() == false) {
                output.push(input.peek());
                input.pop();
            }    
        return output.peek(); 
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return input.empty() && output.empty();
    }
}