// Using Tabulation
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int dpTab[] = new int [n + 1];
        dpTab[0] = 1;
        
        for(int i = 1;  i <= n; i++){
            if(i == 1){
                dpTab[i] = dpTab[i - 1];    
            } else if(i == 2){
                dpTab[i] = dpTab[i -1] + dpTab[i - 2];
            } else {
                dpTab[i] = dpTab[i - 1] + dpTab[i - 2] + dpTab[i - 3];
            }
        }
        
        System.out.println(dpTab[n]);
        
    }

}