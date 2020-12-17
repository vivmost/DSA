package ARRAYS;
import java.util.*;
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = {1,3,4,5,6,7,8};
		
//		kth largest number
		Arrays.sort(arr);
		int result_big = arr[arr.length -n];
		System.out.println(result_big);
		
//		kth smallest number
		int s = sc.nextInt();
		
		Arrays.sort(arr);
		int result_small = arr[s-1];
		System.out.println(result_small);
	}
}
