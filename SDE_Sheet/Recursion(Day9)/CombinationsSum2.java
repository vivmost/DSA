class Solution {
    public void combinations(int[] arr, int target, List<List<Integer>> res, List<Integer> ds, int ind) {
        if(target == 0) {
            res.add(new ArrayList(ds));
            return;
        }
        
        for(int i = ind; i < arr.length; i++) {
            if(i > ind && arr[i] == arr[i - 1]) continue;
            if(arr[i] > target) break;
            
            ds.add(arr[i]);
            combinations(arr, target - arr[i], res, ds, i + 1);
            ds.remove(ds.size()-1); 
        }
    }
    
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        combinations(candidates, target, res, new ArrayList<>(), 0);
        return res;
    }
}