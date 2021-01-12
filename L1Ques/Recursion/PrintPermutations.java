import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printPermutations(str , "");
    }

    public static void printPermutations(String str , String ans) {
        if(str.length() == 0 ){
            System.out.println(ans);
            return;
        }
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String L = str.substring(0, i);
            String R = str.substring(i + 1);
            String ros = L + R;
            printPermutations(ros, ans + ch);
        }
        
    }

}