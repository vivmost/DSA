package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n ; i++) {
			int p = sc.nextInt();
			if( p < 3 ) {
				arr[i] = p;
			}else {
				i--;
			}
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}
