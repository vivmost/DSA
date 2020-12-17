package Strings;
import java.util.*;
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("your string is : " + s);
		
		char []p = s.toCharArray();
		System.out.println("array :" + Arrays.toString(p));
		int n = p.length;
		for(int i=0; i<n;i++) {
			for(int j=i+1; j<n; j++) {
				if(p[i] == p[j]) {
					System.out.println(p[j]);
					break;
				}
			}
		}
	}

}