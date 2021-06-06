class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0, right = (matrix.length*matrix[0].length) -1;
        int col = matrix[0].length;
                         
        if(matrix.length == 0) {return false;}
        
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(matrix[mid/col][mid%col] == target) {
                return true;
            } else if(matrix[mid/col][mid%col] < target){
                left = mid + 1;
            } else {
                right = mid -1;
            } 
        }
        return false;
    }
}