import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int ones  = 1;
        int zeros = 1;
        
        for(int i = 2; i <=n; i++){
            int nzeros = ones;
            int nones = ones + zeros;

            zeros = nzeros;
            ones = nones;
        }
        
        System.out.println(ones + zeros);
        
    }

}