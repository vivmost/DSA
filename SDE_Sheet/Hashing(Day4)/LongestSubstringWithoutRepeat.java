class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int ans = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char ss = s.charAt(i);
            if(map.containsKey(ss)) {
                left = Math.max((map.get(ss)+1), left);
            }
            map.put(ss, i);
            ans = Math.max(ans, 1 + i - left);
        } 
               
        
        return ans;
    }
}