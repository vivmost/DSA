class Solution{
    static void subsets(int sum, ArrayList<Integer> arr, int start, int n, ArrayList<Integer> res) {
        if(start == n) {
            res.add(sum);
            return;
        }
        
        subsets(sum + arr.get(start), arr, start + 1, n, res);
        subsets(sum, arr, start + 1, n, res);
    }
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> res = new ArrayList<>();
        subsets(0, arr, 0, N, res);
        Collections.sort(res);
        return res;
    }
}