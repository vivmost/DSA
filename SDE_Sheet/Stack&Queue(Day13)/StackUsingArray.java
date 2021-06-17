class MyStack
{
    int top;
	int a[] = new int[1000];
    static final int MAX = 1000;
    
    MyStack()
	{
		top = -1;
	}
	
    boolean push(int x)
    {
        if (top >= (MAX - 1)) {
            return false;
        }
        else {
            a[++top] = x;
            return true;
        }
    }
 
    int pop()
    {
        if (top < 0) {
            return -1;
        }
        else {
            int x = a[top--];
            return x;
        }
    }
}