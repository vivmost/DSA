package ARRAYS;
public class q5 {
	void bubbleSort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) 
			for (int j = 0; j < n-i-1; j++) 
				if (arr[j] > arr[j+1]) 
				{ 
					// swap arr[j+1] and arr[i] 
							int temp = arr[j]; 
							arr[j] = arr[j+1]; 
							arr[j+1] = temp; 
				} 
	} 

	/* Prints the array */
	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	// Driver method to test above 
	public static void main(String args[]) 
	{ 
		q5 ob = new q5(); 
		int arr[] = {-1,0,3,57,89,9}; 
		ob.bubbleSort(arr); 
		System.out.println("Sorted array"); 
		ob.printArray(arr); 
	} 
} 