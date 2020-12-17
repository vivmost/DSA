package ARRAYS;
import java.util.Arrays;
import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = 0;
		int minn;
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			
		}
		minn = arr[0];
		
		for (int i = 0; i < n; i++) {
			if (arr[i] < minn) {
				minn = arr[i]; 
			}
			else if(arr[i] > max) {
				max = arr[i]; 
			}
		}
		System.out.println(minn);
		System.out.println(max);
	}
}
