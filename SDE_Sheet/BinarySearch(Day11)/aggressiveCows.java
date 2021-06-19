import java.util.*;
public class Practice{
	
	public static boolean check(int d, int n, int arr[], int c) {
		int last = arr[0];
		int count  = 1;
		for(int i = 1 ; i < n; i++) {
			if(arr[i] - last >= d) {
				count++;
				last = arr[i];
			}
			
		}
		
		if(count >= c) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n =sc.nextInt();
			
			for(int i =0 ; i < n; i++) {
				int x =sc.nextInt();
				int y= sc.nextInt();
				
				int arr[] = new int[x];
                
				for(int j = 0 ; j < x; j++) {
					arr[j] =sc.nextInt();
				}
				
				 Arrays.sort(arr);
				
				int l = 0;
				int r = 1000000000;
				int ans = 0;
				
				while(l <= r) {
					int mid = (l + r) / 2;
					if(check(mid, x, arr, y) == true) {
						ans = mid;
						l = mid + 1;
					}else {
						r = mid-1;
					}
				}
					
				System.out.println(ans);
			}
		
	}
}