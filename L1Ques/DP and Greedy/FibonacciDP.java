// memoized approach

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] mem = new int [n + 1];
        int ans = fib(n , mem);
        System.out.println(ans);
    }
    
    public static int fib(int n , int[] mem){
        if(n == 0 || n == 1){
            return n;
        }
        
        if(mem[n] != 0){
            return mem[n];
        }
        
        int n1 = fib(n - 1 , mem);
        int n2 = fib(n - 2 , mem);
        int ret = n1 + n2;
        mem[n] = ret;

        return ret;
    }

}