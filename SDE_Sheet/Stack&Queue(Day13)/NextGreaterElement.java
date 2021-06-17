class Solution
{
    public static long[] nextLargerElement(long[] arr, int n) 
    { 
        Stack<Long>stack=new Stack<>();
        long arr1[]=new long[arr.length];
        int i=arr.length-1;
        
        while(i>=0)
        {
            while(!stack.isEmpty() && stack.peek()<=arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                arr1[i]=-1;
            }
            else
            {
                arr1[i]=stack.peek();
            }
            stack.push(arr[i]);
            i--;
        }
        return arr1;
    } 
}