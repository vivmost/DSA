package Strings;
import java.util.*;
public class q3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("your string is : " + s);
	
		System.out.println("your string after trim is : " + s.trim());
		System.out.println("your string after \\s is : " + s.replaceAll( "\\s" , ""));
		System.out.println("your string after replace2 is : " + s.replace(" " , ""));
		System.out.println("your string after replaceAll is : " + s.replace(" " , ""));
	}
}
