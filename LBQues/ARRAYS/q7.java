package ARRAYS;
import java.util.*;
public class q7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0 ;
		int [] arr = {3,4,3,5,67,3,32,23};
		for(int i =0 ; i<arr.length; i++) {
			if(arr[i] == n) {
				ans += 1;
			}
		}
		System.out.println(ans);
	}
}

