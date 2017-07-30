public class MinStack {
    /** initialize your data structure here. */
    Stack<Integer> smain = new Stack<Integer>();
    Stack<Integer> sdup = new Stack<Integer>();
    int min= Integer.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int x) {
        smain.push(x);
        if(x<=min)
            min=x;
        sdup.push(min);
    }
    
    public void pop() {
        sdup.pop();
        smain.pop();
        if(smain.isEmpty())
            min= Integer.MAX_VALUE;
        else
            min=sdup.peek();
    }
    
    public int top() {
        return(smain.peek());
    }
    
    public int getMin() {
        //if(!(sdup.isEmpty()))
        return(sdup.peek());
        //return;
    }
}