package Strings;
import java.util.*;
public class q5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s  = sc.nextLine();
		System.out.println("your string is : " + s);
		
		char a[] = s.toCharArray();
		char b[] = new char[s.length()];
		int j =0;
		for(int i=s.length()-1; i>=0; i--) {
			b[j] = a[i]; 
			j++;
		}
		System.out.println(Arrays.toString(b));
	}

}

