class GFG {
    static int square(int n){
        if (n == 0)
            return 0;
 
        if (n < 0)
            n = -n;
 
        int x = n >> 1;

        if (n % 2 != 0)
            return ((square(x) << 2) + (x << 2) + 1);
        else
            return (square(x) << 2);
    }
 
    // Driver code
    public static void main(String args[])
    {
        // Function calls
        for (int n = 1; n <= 5; n++)
            System.out.println("n = " + n
                               + " n^2 = " + square(n));
    }
}