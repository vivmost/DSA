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


--------------------------------------------


// Solving using Tabulation

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.println(arr[n]);
    }

}