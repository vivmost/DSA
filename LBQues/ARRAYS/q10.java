package ARRAYS;
import java.util.*;

public class q10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = 0;
		int a[] = new int[n];
		for(int i =0 ; i<n ; i++) {
			a[i] = sc.nextInt();
		}
		int p = 0;
		for(int i=0; i< n ; i++) {
			if(a[i] < 0) {
				temp = a[p];
				a[p]= a[i];
				a[i] = temp;
				p++;
			}
		}
		System.out.println(Arrays.toString(a));
		
	}
}