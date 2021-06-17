class GFG {
    static int setBitNumber(int n){
        int k = (int)(Math.log(n) / Math.log(2));
        return 1 << k;
    }
 
    // Driver code
    public static void main(String arg[])
    {
        int n = 273;
        System.out.print(setBitNumber(n));
    }
}