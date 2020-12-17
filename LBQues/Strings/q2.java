package Strings;
import java.util.*;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s  = sc.nextLine();
		System.out.println("your string is : " + s);
		int n = s.length();
		char arr[] = s.toCharArray();
		int count = 1;
		
			for(int i=0; i<n; i++) {
				for(int j=i+1; j<n; j++) {
					if(arr[j] == arr[i]) {
						count++;
					}
				}
				System.out.println(arr[i] +" = "+ count);
				count = 1;
			}
		
		
		
	}

}