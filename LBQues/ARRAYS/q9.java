package ARRAYS;
import java.util.*;

public class q9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int result;
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i =0 ; i<n ; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		if(a[0] < 0) {
			result = a[a.length-1] - a[0];
		}else if(a[0]== 0){
			result = a[a.length-1] - a[0] ;
		}else {
			result = a[a.length-1] - a[0] + 1;
		}
		System.out.println(result);
	}
}
