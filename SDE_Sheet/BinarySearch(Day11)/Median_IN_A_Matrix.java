class Solution {
    private int countSmallerThanMid(int[] row, int mid) {
        int l = 0, h = row.length - 1; 
        while(l <= h) {
            int md = (l + h) >> 1; 
            if(row[md] <= mid) {
                l = md + 1;
            }
            else {
                h = md - 1;
            }
        }
        return l; 
    }
    
    int median(int A[][], int r, int c) {
        // code here       
        int low = Integer.MIN_VALUE;
        int high = Integer.MAX_VALUE; 
        int n = A.length;
        int m = A[0].length; 
        while(low <= high) {
            int mid = (low + high) >> 1; 
            int cnt = 0;
            for(int i = 0;i<n;i++) {
                cnt += countSmallerThanMid(A[i], mid); 
            }
    
            if(cnt <= (n * m) / 2) low = mid + 1; 
            else high = mid - 1; 
        }
        return low; 
    }
}
