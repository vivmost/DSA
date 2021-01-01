import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        ArrayList <String> ans = getKPC(s);
        System.out.println(ans);
    }
    
    static String[] codes = {
        ".;",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tu",
        "vwx",
        "yz"
    };

    public static ArrayList < String > getKPC(String str) {
        if(str.length() == 0){
            ArrayList <String> baseAns = new ArrayList <String> ();
            baseAns.add("");
            return baseAns;
        }
        
        char fos = str.charAt(0);
        String ros = str.substring(1);
        
        ArrayList < String > rres = getKPC(ros);
        ArrayList < String > mres = new ArrayList < > ();
        
        String charAtFos = codes[fos - '0'];
        for(int i = 0; i < charAtFos.length(); i++){
            char addCh = charAtFos.charAt(i);
            for(String ansCh : rres){
                mres.add(addCh + ansCh);
            }
        }
        
        return mres;
        
    }

}