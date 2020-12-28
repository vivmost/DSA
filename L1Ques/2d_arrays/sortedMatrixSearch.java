import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        int x = Integer.parseInt(br.readLine());
        int count = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == x){
                    count++;
                    a = i;
                    b = j;
                    break;
                }
            }
        }
        
        if(count > 0){
            System.out.println(a);
            System.out.println(b);
        } else {
            System.out.println("Not Found");
        }
        
        
        
        
        
    }
}